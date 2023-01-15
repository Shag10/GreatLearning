import java.util.Scanner;
public class StairCase {
    // A simple recursive program to find
    // n'th fibonacci number
    static int fib(int n)
    {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }

    // Returns number of ways to reach s'th stair
    static int countWays(int s)
    {
        return fib(s+1);
    }

    /* Driver program to test above function */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.print(countWays(s));
    }
}
