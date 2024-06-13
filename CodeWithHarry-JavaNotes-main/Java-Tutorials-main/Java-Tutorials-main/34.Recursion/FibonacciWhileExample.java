// public class FibonacciSeries {
//     // 0 1 1 2 3 5 8 13 21 34
//     // 1 1 2 3 5 8 13 21 34 55

//     public static int FibonacciSeries(int n){
//         if(n == 0){
//             return 0;
//         }
//         if(n ==1 || n == 2){
//             return 1;
//         }

//         return FibonacciSeries(n-1) + FibonacciSeries(n-2);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         int a = 0, b = 1;
//         for(int i = 0; i < n; i++){
//             System.out.println(a);
//             int c = a + b;
//             a = b;
//             b = c;
//         }
//     }
// }







// public class FibonacciSeries{
// 	public static int fibonacciRecursion(int n){
// 	if(n == 0){
// 		return 0;
// 	}
// 	if(n == 1 || n == 2){
// 			return 1;
// 		}
// 	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
// 	}
//     public static void main(String args[]) {
// 	int maxNumber = 10;
// 	System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
// 	for(int i = 0; i < maxNumber; i++){
// 			System.out.print(fibonacciRecursion(i) +" ");
// 		}
// 	}
// }




//Using  For Loop
// public class FibonacciExample {
// 	public static void main(String[] args) 
// 	{
// 		// Set it to the number of elements you want in the Fibonacci Series
// 		 int maxNumber = 10; 
// 		 int previousNumber = 0;
// 		 int nextNumber = 1;
// 	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
// 	        for (int i = 1; i <= maxNumber; ++i)
// 	        {
// 	            System.out.print(previousNumber+" ");
// 	            /* On each iteration, we are assigning second number
// 	             * to the first number and assigning the sum of last two
// 	             * numbers to the second number
// 	             */
 
	      
// 	            int sum = previousNumber + nextNumber;
// 	            previousNumber = nextNumber;
// 	            nextNumber = sum;
// 	        }
// 	}
// }







//Using  While Loop
public class FibonacciWhileExample {
	public static void main(String[] args) 
	{
		 int maxNumber = 10, previousNumber = 0, nextNumber = 1;
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        int i=1;
	        while(i <= maxNumber)
	        {
	            System.out.print(previousNumber+" ");
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	            i++;
	        }
 
	}
 
}
