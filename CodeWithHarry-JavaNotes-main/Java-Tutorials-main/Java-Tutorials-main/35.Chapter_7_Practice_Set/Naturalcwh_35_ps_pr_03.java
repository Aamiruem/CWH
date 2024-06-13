//sum of n Natural numbers
//sum(n) = 1 + 2 + 3 + 4.....  + n
//sum(n) = 1 + 2 + 3 + 4..... + n-1 + n
//sum(n) = sum(n-1) + n
//sum(3) = 3 + sum(2)
//sum(3) = 3 + 2 + sum(1)

import java.util.*;
public class Naturalcwh_35_ps_pr_03 {
    static int recursive_sum(int n) {
        if (n==1) {
            return 1;
        }
        else {
            return n + recursive_sum(n-1);
        }
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " natural numbers is: " + recursive_sum(n));
        sc.close();
    }
}
