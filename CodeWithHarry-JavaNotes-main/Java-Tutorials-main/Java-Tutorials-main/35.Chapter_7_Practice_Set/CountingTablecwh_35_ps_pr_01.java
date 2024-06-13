import java.util.*;


public class CountingTablecwh_35_ps_pr_01 {
    static void multiplication(int n) {
        for (int i=1; i<=10; i++) {
        System.out.println(n + " * " + i + " = " + (n*i));
      }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        multiplication(sc.nextInt());
        sc.close();
    }
}
