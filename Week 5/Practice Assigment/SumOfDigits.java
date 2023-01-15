import java.util.Scanner;
public class SumOfDigits {

        // Recursive function to print
        // the number in reversed form
        public static int sumOfDigits(int num)
        {
                if(num == 0) return 0;
                return num%10+ sumOfDigits(num/10);
                
        }

        // driver code
        public static void main(String args[])
        {
                Scanner sc = new Scanner(System.in);
                
                int num = sc.nextInt();
                // calling recursive function
                // to print the number in
                // reversed form
                System.out.println(sumOfDigits(num));
        }
}
