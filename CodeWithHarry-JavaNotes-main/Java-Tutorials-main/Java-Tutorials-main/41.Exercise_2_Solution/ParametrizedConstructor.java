// Paramerterized constructor : A constructor with some specified number of parameters is known as a parameterized constructor.

class cwh {
    cwh(String s, int b){
        System.out.println("This is the " + b + "th video of " + " " + s);
    }
}
public class ParametrizedConstructor {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        cwh obj42 = new cwh("CodeWithHarry", 42);


        @SuppressWarnings("unused")
        cwh obj0 = new cwh("CodeWithHarry", 1);
        cwh obj1 = new cwh("CodeWithHarry", 2);
        cwh obj2 = new cwh("CodeWithHarry", 3);
        cwh obj3 = new cwh("CodeWithHarry", 4);
        cwh obj4 = new cwh("CodeWithHarry", 5);

    }
}
