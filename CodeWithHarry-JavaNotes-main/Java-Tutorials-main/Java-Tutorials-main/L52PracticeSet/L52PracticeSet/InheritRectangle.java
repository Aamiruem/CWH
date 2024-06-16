class Rectangle {
    protected int length;
    protected int width;

    Rectangle() {
        System.out.println("I am a non-parametrized constructor of Rectangle");
    }

    Rectangle(int length, int width) {
        System.out.println("I am a parametrized constructor of Rectangle");
        this.length = length;
        this.width = width;
    }

    public int area() {
        return this.length * this.width;
    }

    public int perimeter(int l, int d) {
        this.length = l;
        this.width = d;
        // return 2 * (this.length + this.width);
        return 2 * (l + d);
    }
}

class Cuboid extends Rectangle {
    private int height;

    Cuboid() {
        System.out.println("I am a non-parametrized constructor of Cuboid");
    }

    Cuboid(int length, int width, int height) {
        super(length, width);
        System.out.println("I am a parametrized constructor of Cuboid");
        this.height = height;
    }

    public int volume() {
        return this.length * this.width * this.height;
    }

    public int surfaceArea() {
        return 2 * (this.length * this.width + this.width * this.height + this.height * this.length);
    }
}

public class InheritRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Perimeter of Rectangle: " + rect.perimeter(2, 4));

        Cuboid cub = new Cuboid(5, 3, 4);
        System.out.println("Volume of Cuboid: " + cub.volume());
        System.out.println("Surface Area of Cuboid: " + cub.surfaceArea());
    }
}
