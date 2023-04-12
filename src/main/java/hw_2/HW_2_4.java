package hw_2;

import java.io.*;

public class HW_2_4 {

    // Задание 4) Исправьте код, примените подходящие способы обработки исключений:
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"apple", "orange"};
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("/broken_reference");
            // Индекс массива выходит за пределы.
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Индекс массива выходит за пределы");
            // Переполнение стека (бесконечная рекурсия)
        } catch (StackOverflowError error) {
            error.printStackTrace();
            System.out.println("Бесконечная рекурсия при создании файла");
            // Деление на ноль
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
            // Файл не найден (для inputStream)
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
            // Остальные случаи
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("Что-то сломалось");
        } finally {
            assert System.out != null;
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }

    //    Изначально метод уходил в бесконечную рекурсию. Результат чтения из файла не использовался.
//    Внесены изменения, согласно которых рекурсивно создаётся новый файл (пока не будет создан)
//    Далее происходит чтение символа из файла и вывод его в консоль.
//    При чтении обрабатывается исключение FileNotFoundException
//    Весь метод - IOException
    private static void test() throws IOException {
        File file = new File("1");
        if (!file.createNewFile()) {
            try {
                FileReader reader = new FileReader(file);
                int symbol = reader.read();
                if (symbol != -1) {
                    System.out.println("Символ из файла " + symbol);
                } else {
                    System.out.println("Файл пустой");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден! Возникло исключение " + e);
            }
        } else {
            test();
        }
    }
}