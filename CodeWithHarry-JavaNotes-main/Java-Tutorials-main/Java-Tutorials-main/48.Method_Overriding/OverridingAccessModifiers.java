class Parent{
    @SuppressWarnings("unused")
    private void method1(){
        System.out.println("I am a private method of Parent class");
    }
    protected void method2(){
        System.out.println("I am a public method of Parent class");
    }
}

class Child extends Parent{
    private void method1(){
        System.out.println("I am a public method of Child class");
    }
    @Override public void method2(){
        System.out.println("I am a private method of Child class");
    }
}



public class OverridingAccessModifiers {
    public static void main(String[] args) {
        
        Parent p = new Parent();
        p.method2();

        Child c = new Child();
        c.method2();

    }
}
