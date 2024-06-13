public class VariableArguments {
//	static int sum(int a, int b){
//		return a+b;
//	}
//	static int sum(int a, int b, int c){
//		return a+b+c;
//	}
//	static int sum(int a, int b, int c, int d){
//		return a+b+c+d;
//	}



	public static int sum(int x, int... arr){
		//Available as int [ arr;
		int result = x;
//		for each loop
        for (int a : arr){
            result = result + a;
        }
        return result;
	}
	public static void main(String[] args){
		System.out.println("Welcome to Variables Arguments:");
        System.out.println("The sum of 2 and 3 is: " + sum(2,3));
        System.out.println("The sum of 2 and 3 and 4 is: " + sum(2,3,4));
        System.out.println("The sum of 2 and 3 and 4 and 5 is: " + sum(2,3,4,5));
        System.out.println("The sum of 2 and 3 and 4 and 5 and 6 is: " + sum(2,3,4,5));
	}
}
