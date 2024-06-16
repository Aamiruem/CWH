// Create a method for area and volume in 1 



// class Circle {
//     protected int radius;

//     Circle() {
//         System.out.println("I am a non-parametrized constructor of Circle");
//     }

//     Circle(int radius) {
//         System.out.println("I am a parametrized constructor of Circle");
//         this.radius = radius;
//     }

//     public double area() {
//         return Math.PI * this.radius * this.radius;
//     }
// }

// class Cylinder extends Circle {
//     private int height;

//     Cylinder() {
//         System.out.println("I am a non-parametrized constructor of Cylinder");
//     }

//     Cylinder(int radius, int height) {
//         super(radius);
//         System.out.println("I am a parametrized constructor of Cylinder");
//         this.height = height;
//     }

//     public double volume() {
//         return Math.PI * this.radius * this.radius * this.height;
//     }

//     public void areaAndVolume() {
//         double area = area();
//         double volume = volume();
//         System.out.println("Area of the base circle: " + area);
//         System.out.println("Volume of the cylinder: " + volume);
//     }
// }

// public class InheritCircle {
//     public static void main(String[] args) {
//         Circle c = new Circle(12);
//         System.out.println("Area of Circle: " + c.area());

//         Cylinder cy = new Cylinder(3, 5);
//         cy.areaAndVolume();
//     }
// }








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

    public void areaAndVolume() {
        System.out.println("Area of the base circle: " + area());
        System.out.println("Volume of the cylinder: " + volume());
    }
}

public class InheritCircle {
    public static void main(String[] args) {
        Circle c = new Circle(12);
        System.out.println("Area of Circle: " + c.area());

        Cylinder cy = new Cylinder(3, 5);
        cy.areaAndVolume();
    }
}
