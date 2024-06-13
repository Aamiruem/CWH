// using Recursion

// public class cwh_35_ps_pr_04 {
//     static void pattern(int n) {
//         for (int i = n; i > 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         pattern(5);
//     }
// }







import java.util.*;
public class cwh_35_ps_pr_04 {
    static void pattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        pattern(n);
    }
}
