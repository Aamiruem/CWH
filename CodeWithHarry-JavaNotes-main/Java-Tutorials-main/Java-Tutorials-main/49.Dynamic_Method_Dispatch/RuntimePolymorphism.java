//class Animal{}
// class Dog extends Animal{}

//Animal is superclass
//Dog is subclass

//Animal a = new Dog(); =>upcasting

class Phone {
    public void callReceived() {
        System.out.println("you picked up the phone");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    public void on() {
        System.out.println("Turning on SmartPhone...");

    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {

        Phone obj = new SmartPhone(); // Allowed
        //SmartPhone obj2 = new Phone(); // not Allowed

        obj.callReceived();
        obj.on();
    }
}
