package hw_3;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("Неверный размер массива");
    }
}
