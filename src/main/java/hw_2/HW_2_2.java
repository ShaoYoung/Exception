package hw_2;

public class HW_2_2 {

    // Задание 2) Если необходимо, исправьте данный код
    public static void task_2() {
//  java: cannot find symbol
//  symbol:   variable intArray
//      Изменения в коде: объявлен массив intArray
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }


    public static void main(String[] args) {

        System.out.println("=== Задание 2.");
        task_2();

    }
}
