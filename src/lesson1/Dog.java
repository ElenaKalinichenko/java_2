package lesson1;

public class Dog extends  Animal {
    // Animal(String type, String name, int maxRunDistance, int maxJumpHeigth, int maxSwimDistance)
    public Dog(String name, String type, int maxRunDistance, int maxJumpHeigth, int maxSwimDistance) {
        super( type, name, maxRunDistance,maxJumpHeigth,maxSwimDistance);
    }
}
