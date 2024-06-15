class Parent{
    final void method1(){
        System.out.println("Method1 of Parent class.");
    }
    final void method2(){
        System.out.println("Method2 of Parent class.");
    }
}

class Child extends Parent{
    void method1(){
        System.out.println("Method1 of Child class.");
    }
    void method2(){
        System.out.println("Method2 of Child class.");
    }
    void method3(){
        System.out.println("Method3 of Child class.");
    }
}




public class finalMethods {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.method1();
        p.method2();
        
        Child c = new Child();
        c.method1();
        c.method2();
        c.method3();
    }
}
