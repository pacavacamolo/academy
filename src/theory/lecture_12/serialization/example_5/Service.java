package theory.lecture_12.serialization.example_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import theory.lecture_12.serialization.Ellipse;

// пример о сериализации static и о serialVersionUID
class Service {

    public static void main(String[] args) {
        Ellipse sr = new Ellipse();

        try (FileOutputStream fos = new FileOutputStream("test.txt"); ObjectOutputStream out = new ObjectOutputStream(fos)) {
            out.writeObject(sr);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        sr.setLength(1000); //после сериализации меняем значение поля чтобы убедиться, что оно не было сериализовано
        Ellipse object = null;

        try (FileInputStream fis = new FileInputStream("test.txt"); ObjectInputStream in = new ObjectInputStream(fis)) {
            object = (Ellipse) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("данные после сериализации/десериализации: ");
        System.out.println("дата: " + object.getCreatedBy());
        System.out.println("число: " + object.getRadius());
        System.out.println("длина: " + object.getLength()); //length - статическое поле, оно не было сериализовано, значение статического поля при десериализации берется из класса.
        System.out.println("serial: " + object.getSerialVersionUID());
    }
}


