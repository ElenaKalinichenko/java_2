package lesson2;

public class MyArraySizeException  extends Exception{

    private  int number;

    public int getNumber() {
        return number;
    }

    public MyArraySizeException(String message, int number) {
        super(message);
        this.number = number;
    }
}
