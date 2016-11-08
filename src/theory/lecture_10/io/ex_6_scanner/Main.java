package theory.lecture_10.io.ex_6_scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Scanner логически разделяет данные на части. В примере - сканнер выводит на печать каждое слово по отдельности,
 * в зависимости от того, какой разделитель используется. По умолчанию - whiteSpace - но это не только пробел, а
 * еще табуляция, перенос строки и т.д. (проверить можно используя Character.isWhiteSpace)
 * Можно поменять разделитель
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner s = new Scanner(new BufferedReader(new FileReader("resources/from.txt")))) {
            //заменяем разделитель
//            s.useDelimiter("e");
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        }
    }
}
