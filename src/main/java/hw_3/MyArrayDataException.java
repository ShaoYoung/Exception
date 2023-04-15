package hw_3;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int row, int col) {
        super("Некорректные данные в массиве, строка " + row + ", столбец " + col);
    }


}
