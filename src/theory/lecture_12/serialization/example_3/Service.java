package theory.lecture_12.serialization.example_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import theory.lecture_12.serialization.Square;

/**
 * Класс демонстрирует возможность управлять сериализацией с помошью приватных методов writeObject\readObject
 */
class Service {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test.txt"); ObjectOutputStream out = new ObjectOutputStream(fos)) {
            Square sr = new Square();
            sr.setRadius(1000);
            out.writeObject(sr);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Square object = null;

        try (FileInputStream fis = new FileInputStream("test.txt"); ObjectInputStream in = new ObjectInputStream(fis)) {
            object = (Square) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(" число: " + object.getRadius());
    }


}


