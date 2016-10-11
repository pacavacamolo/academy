package theory.lecture_12.serialization.example_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import theory.lecture_12.serialization.Circle;

/**
 * Это пример того, что объект, записанный в поток,сохранит свое состояние.
 * Возможны запись и чтение нескольких объектов.
 */
class Service {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test.txt"); ObjectOutputStream out = new ObjectOutputStream(fos)) {
            Circle sr = new Circle();
            sr.setRadius(1000);
            out.writeObject(sr);
            sr.setRadius(5000);
            sr = null;
            Circle sr2 = new Circle();
            out.writeObject(sr2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Circle object = null;

        try (FileInputStream fis = new FileInputStream("test.txt"); ObjectInputStream in = new ObjectInputStream(fis)) {
            object = (Circle) in.readObject();
            System.out.println(" число: " + object.getRadius());
//            object = (Circle) in.readObject();
//            System.out.println(" число: " + object.getRadius());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}


