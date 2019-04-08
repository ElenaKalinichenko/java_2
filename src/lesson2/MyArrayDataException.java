package lesson2;

public class MyArrayDataException extends Exception {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MyArrayDataException(String mess) {
        super(mess);
        this.x = x;
        this.y = y;
    }
}
