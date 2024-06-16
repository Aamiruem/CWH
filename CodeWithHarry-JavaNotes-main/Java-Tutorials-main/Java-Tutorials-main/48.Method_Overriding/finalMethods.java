class Parent {
    final void method1() {
        System.out.println("Method1 of Parent class.");
    }

    final void method2() {
        System.out.println("Method2 of Parent class.");
    }

    final void method3() {
        System.out.println("Method3 of Parent class.");
    }
}

class Child extends Parent {
    // The following methods are commented out because they cannot override final methods in Parent class
    // public void method1() {
    //     System.out.println("Method1 of Child class.");
    // }

    // public void method2() {
    //     System.out.println("Method2 of Child class.");
    // }

    // public void method3() {
    //     System.out.println("Method3 of Child class.");
    // }

    // You can add new methods or override non-final methods from Parent class here
    public void newMethod() {
        System.out.println("New Method of Child class.");
    }
}

public class finalMethods {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.method1();
        p.method2();
        p.method3();

        Child c = new Child();
        c.method1();  // This will call the method1 of Parent class since overriding is not possible
        c.method2();  // This will call the method2 of Parent class since overriding is not possible
        c.method3();  // This will call the method3 of Parent class since overriding is not possible
        c.newMethod();  // This will call the newMethod of Child class
    }
}
