package hw_2;

import java.util.Scanner;

public class HW_2_1 {
    // Задание 1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float inputFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число - > ");
                float number = scanner.nextFloat();
                return number;
            } catch (Exception e) {
                System.out.printf("Вы ввели не число и вызвали исключение %s! Повторите ввод!", e);
                System.out.println();
                scanner.next();
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("=== Задание 1.");
        System.out.println(inputFloatNumber());

    }
}
