package theory.lecture_12.serialization.example_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import theory.lecture_12.serialization.Triangle;

/**
 * пример о сериализации синглтона
 */
class Service {

    public static void main(String[] args) throws ClassNotFoundException {
        Triangle sr = Triangle.getInstance();

        try (FileOutputStream fos = new FileOutputStream("test.txt"); ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(sr);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Triangle object = null;

        try (FileInputStream fis = new FileInputStream("test.txt"); ObjectInputStream in = new ObjectInputStream(fis)) {
            object = (Triangle) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Объект после десериализации остался прежним?  " + (sr == object));
    }

}


