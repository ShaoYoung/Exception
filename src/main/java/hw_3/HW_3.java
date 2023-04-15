package hw_3;
//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
//   При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
//   Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//   должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
//   и вывести результат расчета (сумму элементов, при условии, что подали на вход корректный массив).

public class HW_3 {

    public static int checkMatrix(String[][] matrix) throws MyArrayDataException, MyArraySizeException {
        if (matrix.length != 4 || matrix[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sumMatrix = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sumMatrix += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sumMatrix;
    }

    public static void main(String[] args) {

//        String[][] matrix = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
//        String[][] matrix = {{"1", "2", "3"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] matrix = {{"1", "2", "3", "q"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            System.out.printf("Сумма элементов матрицы равна %s", checkMatrix(matrix));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.toString());
        }
    }
}
