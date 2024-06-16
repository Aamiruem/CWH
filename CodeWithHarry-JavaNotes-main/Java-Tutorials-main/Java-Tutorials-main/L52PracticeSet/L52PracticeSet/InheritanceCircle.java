// create methods for area & volume in 2 also create getters and setters 




class Circle {
    protected int radius;

    Circle() {
        System.out.println("I am a non-parametrized constructor of Circle");
    }

    Circle(int radius) {
        System.out.println("I am a parametrized constructor of Circle");
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class Cylinder extends Circle {
    private int height;

    Cylinder() {
        System.out.println("I am a non-parametrized constructor of Cylinder");
    }

    Cylinder(int radius, int height) {
        super(radius);
        System.out.println("I am a parametrized constructor of Cylinder");
        this.height = height;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(int height) {
        this.height = height;
    }

    // Method to print area and volume
    public void printAreaAndVolume() {
        System.out.println("Area of the base circle: " + area());
        
        System.out.println();

        System.out.println("Volume of the cylinder: " + volume());
    }
}

public class InheritanceCircle {
    public static void main(String[] args) {
        Circle c = new Circle(12);

        System.out.println();

        System.out.println("Area of Circle: " + c.area());

        Cylinder cy = new Cylinder(3, 5);

        System.out.println();

        cy.printAreaAndVolume();

        // Demonstrating the use of getters and setters
        cy.setRadius(7);

        System.out.println();

        cy.setHeight(10);

        System.out.println("Updated Radius of Cylinder: " + cy.getRadius());

        System.out.println();

        System.out.println("Updated Height of Cylinder: " + cy.getHeight());

        System.out.println();
        
        cy.printAreaAndVolume();
        
    }
}
