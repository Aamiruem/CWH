//base class
class Parent{
    void show(){
        System.out.println("I am in parent class");
    }
}

//Inherit class
class Child extends Parent{
    //overriding method
    //this method override show() of Parent
    @Override void show(){
        System.out.println("I am in child class");
    }
}



public class methodOverriding {
    public static void main(String[] args) {
        
        Parent p = new Parent();
        p.show();

        Child c = new Child();
        c.show();

    }
}
