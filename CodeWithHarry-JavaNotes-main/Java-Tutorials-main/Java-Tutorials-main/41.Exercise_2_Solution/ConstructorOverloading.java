class Employee{
    //First Constructor
    Employee(String s, int i){
        System.out.println("The name of the first Employee is: " + s);
        System.out.println("The id of the first Employee is: " + i);
    }

    //Second Constructor
    //constructor overloaded
    Employee(int i, String s, int salary){
        System.out.println("The name of the second Employee is: " + s);
        System.out.println("The id of the second Employee is: " + i);
        System.out.println("The salary of the second Employee is: " + salary);
    }
}



public class ConstructorOverloading {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Employee kamran = new Employee("kamran", 1);

        Employee khan = new Employee(2, "khan", 270000);
    }
}
