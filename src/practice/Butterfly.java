package practice;

import java.util.Scanner;

public class Butterfly {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность N*N ");
        int size = in.nextInt();

        int array[][] = new int[size][size];
        int i, j = 0;

        for (i = 0; i < size / 2; i++) {
            for (j = 0; j < size; j++) {
                if (j < i || j >= size - i) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }

        for (i = size - 1; i >= size / 2; i--) {
            for (j = size - 1; j >= 0; j--) {
                if (j > i || j < size - 1 - i) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
