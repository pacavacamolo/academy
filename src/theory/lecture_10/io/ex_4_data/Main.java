package theory.lecture_10.io.ex_4_data;

import org.apache.log4j.Logger;

import java.io.*;

/**
 * Created by Антон on 06.11.2016.
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    static final String dataFile = "resources/to.txt";

    static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
    static final int[] units = { 12, 8, 13, 29, 50 };
    static final String[] descs = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    public static void main(String[] args) {
        print();
        read();
    }

    private static void print() {
        try (DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)
                )
        )) {
            for (int i = 0; i < prices.length; i ++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read() {
        double price;
        int unit;
        String desc;
        double total = 0.0;

        try (DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)
                )
        )){
            while (true) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();

                System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                        unit, desc, price);
                total += unit * price;
            }
        // это исключение обязательно,только так цикл прерывается, DataInputStream читает пока не получим исключение
        } catch (EOFException e) {

        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        System.out.format("total getPrice is %f", total);
    }
}
