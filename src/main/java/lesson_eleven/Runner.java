package lesson_eleven;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 3}
        };

        for (int i = 0; i < matrix.length; i++)  {
            for (int g = 0; g < matrix[i].length; g++) {
                System.out.println(String.format("Element[%s] [%s] = %s", i, g, matrix[i][g]));
            }
        }

        int [] numbers = {4, 3, 7, 11, 1};
        int min = numbers[0];
        int max= numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println(String.format("Минимальное число: %d", min));
        System.out.println(String.format("Максимальное число: %d", max));
        for (int number : numbers) {
            System.out.println(String.format("Элемент масива: %d", number));
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            int a = numbers[i];
            numbers[i] = numbers[numbers.length - 1 -i];
            numbers[numbers.length - 1 -i] = a;
        }
        for (int number : numbers) {
            System.out.println(String.format("Элемент масива: %d", number));
        }

        int indexToDelete = 2;
        System.out.println(String.format("Удаляю индекс: %d", indexToDelete));
        int[] newNumbers = new int[numbers.length - 1];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != indexToDelete) {
                newNumbers[j] = numbers[i];
                j++;
            }
        }
        Arrays.sort(newNumbers);
        for (int number : newNumbers) {
            System.out.println(String.format("Элемент масива: %d", number));
        }

        for (int i = 0; i < matrix.length; i++) {
            int maxTwo = matrix[i][0];
            for (int g = 0; g < matrix[i].length; g++) {
                if (matrix[i][g] > maxTwo) {
                    maxTwo = matrix[i][g];
                }
            }
            System.out.println(String.format("Строка [%s]: максимальное число [%s].", i + 1, maxTwo ));
        }

        int firstDiagonal = 0;
        int secondDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            firstDiagonal += matrix[i][i];
            secondDiagonal += matrix[i][matrix.length - 1 -i];
        }
        System.out.println(String.format("Сумма первой диагонали %d", firstDiagonal));
        System.out.println(String.format("Сумма второй диагонали %d", secondDiagonal));

        int [][] transpose = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int g = 0; g < matrix[i].length; g++) {
                transpose[g][i] = matrix[i][g];
            }
        }
        for (int i = 0; i < transpose.length; i++)  {
            for (int g = 0; g < transpose[i].length; g++) {
                System.out.println(String.format("Element[%s] [%s] = %s", i, g, transpose[i][g]));
            }
        }
    }
}
