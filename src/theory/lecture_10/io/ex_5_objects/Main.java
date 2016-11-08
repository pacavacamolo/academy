package theory.lecture_10.io.ex_5_objects;

import java.io.*;

/**
 * Created by Антон on 06.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("resources/out.txt"));
             ObjectInputStream in = new ObjectInputStream(
                     new FileInputStream("resources/out.txt"))) {

            MyObject my = new MyObject();
            out.writeObject(my);

            MyObject returned = (MyObject) in.readObject();
            System.out.println(returned);

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }
}
