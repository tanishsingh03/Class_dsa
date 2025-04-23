
abstract class Shape {
     
    abstract void draw();

    // Non-abstract method
    void display() {
        System.out.println("Displaying shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}


public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();     
        Shape s2 = new Rectangle();

        s1.draw();   
        s1.display();

        s2.draw();   
    }
}
