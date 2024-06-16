class Base {
    Base() {
        System.out.println("Base class constructor");
    }
}

class Derived1 extends Base {
    Derived1() {
        System.out.println("Derived1 class constructor");
    }
}

class Derived2 extends Derived1 {
    Derived2() {
        System.out.println("Derived2 class constructor");
    }
}

public class ConstructorOrder {
    public static void main(String[] args) {
        Derived2 obj = new Derived2();
    }
}
