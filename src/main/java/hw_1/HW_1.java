package hw_1;

import java.util.Arrays;

public class HW_1 {
    //        1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//        Метод должен пройтись по каждому элементу и проверить что он не равен null.
//        А теперь реализуйте следующую логику:
//        Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
    public static String checkArray(Integer[] arr) {
        StringBuilder sbResult = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                sbResult.append(Integer.toString(i)).append(" ");
                System.out.printf("Элемент массива с номером %s - null \n", i);
            }
        }
        if (sbResult.isEmpty()) {
            return ("Массив не содержит null");
        } else {
            return "В массиве есть элементы, равные null, по следующим индексам: " + sbResult.toString();
        }
    }


    //        2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//        каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static int[] sumArray(int[] arr1, int[] arr2) {
        int[] result = new int[Math.min(arr1.length, arr2.length)];
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не равны!");
        } else {
            for (int i = 0; i < result.length; i++) {
                result[i] = arr1[i] + arr2[2];
            }
        }
        return result;
    }

    // Печать матрицы
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%s ", matrix[i][j]);
            }
            System.out.println();
        }
    }

//        3*. Реализуйте метод, принимающий в качестве аргументов двумерный массив.
//        Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова, детализировать какие строки со столбцами не требуется.
    public static boolean checkMatrix(int[][] matrix){
//        Поскольку фиксация номеров строки и столбца, длины которых не равны, не требуется, то достаточно просто иметь возможность
//        обратиться к элементу массива по прямому индексу (например, matrix[i][j]) и по обратному (matrix[j][i]). При обходе всего
//        массива не должно генерироваться исключение ArrayIndexOutOfBoundsException. Если возникает исключение, то это признак того, что
//        длина строки не совпадает с длиной столбца тоо же номера.
        try {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int a = matrix[i][j];
                    int b = matrix[j][i];
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println("=== Задание 1.");
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, null, 8, 9};
        System.out.println(checkArray(array));

        System.out.println("=== Задание 2.");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        System.out.println(Arrays.toString(sumArray(arr1, arr2)));

        System.out.println("=== Задание 3.");
        // Пример "не правильной" матрицы
        int[][] matrix = {{1, 1, 1, 1}, {0, 0}, {1, 1}, {0, 0}};
        // Пример "правильной" матрицы
//        int[][] matrix = {{1, 1, 1, 1}, {0, 0, 0}, {1, 1, 1}, {0}};
        printMatrix(matrix);
        System.out.println(checkMatrix(matrix));


    }
}
