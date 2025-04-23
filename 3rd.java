
interface Shape {
    void draw(); 
    void display(); // Non-abstract method
    default void display() {
        System.out.println("Displaying shape...");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    default void display() {
        System.out.println("Displaying Circle...");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
    default void display() {
        System.out.println("Displaying Rectangle...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();    
        Shape s2 = new Rectangle();

        s1.draw();  
        s2.draw();  
        s1.display(); // Calls the default method from the interface
        s2.display(); // Calls the default method from the interface
    }
}
