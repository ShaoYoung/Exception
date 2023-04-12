package hw_2;

public class HW_2_3 {

// Задание 3) Дан следующий код, исправьте его там, где требуется
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
            // Т.к. в коде есть операция деления, на всякий случай можно добавить обработку исключения ArithmeticException
            // но в данном случае это не обязательно, т.к. делитель указан программно (не вводится пользователем)
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль невозможно!");
            // java.lang.IndexOutOfBoundsException - Некоторый тип индекса находится за пределом.
            // Для проверки массива лучше обрабатывать java.lang.ArrayIndexOutOfBoundsException -
            // Индекс массива выходит за пределы.
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
            // java.lang.NullPointerException - Недопустимое использование нулевой ссылки.
            // В данном коде такое исключение невозможно. Можно удалить.
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
            // Обработку исключения Throwable необходимо делать в последнюю очередь
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    //    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//    Метод не работает с файлами, соответственно бросать исключение FileNotFoundException не может. Удаляем.
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
