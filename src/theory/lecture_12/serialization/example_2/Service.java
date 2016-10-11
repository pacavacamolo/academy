package theory.lecture_12.serialization.example_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import theory.lecture_12.serialization.Rectangle;

/**
 * Класс демонстрирует какие конструкторы вызываются при десериализации
 */
class Service {

    public static void main(String[] args) {
        Rectangle sr = new Rectangle();
        System.out.println("объект создан");

        try (FileOutputStream fos = new FileOutputStream("test.txt"); ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(sr);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("сериализация с записью в файл прошла, начало десериализации");

        Rectangle object = null;

        try (FileInputStream fis = new FileInputStream("test.txt"); ObjectInputStream in = new ObjectInputStream(fis)) {
            object = (Rectangle) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("данные после десериализации: ");
        System.out.println("дата: " + object.getCreatedBy());
        System.out.println(" число: " + object.getRadius());
        System.out.println(" поток: " + object.getThread());
    }


}


