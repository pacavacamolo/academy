package theory.lecture_1;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String text = scanner.nextLine();

        System.out.println("Строка, которую Вы ввели: " + text);
    }
}
