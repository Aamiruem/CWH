// Default constructor : A constructor with 0 parameters is known as default constructor.

// Constructors are similar to methods,, but they are used to initialize an object.

// Constructors do not have any return type(not even void).

// Every time we create an object by using the new() keyword, a constructor is called.

// If we do not create a constructor by ourself, then the default constructor(created by Java compiler) is called.

class cwh{

    cwh(int i){
        System.out.println("This is a Default constructor of cwh class.");
    }

    public cwh(int i) {
        //TODO Auto-generated constructor stub
    }

    public char[] getX() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getX'");
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        cwh obj = new cwh();
        System.out.println("This is the end of the program.");
    }
}
