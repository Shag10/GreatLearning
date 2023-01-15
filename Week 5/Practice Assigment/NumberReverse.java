import java.util.Scanner;
public class NumberReverse {

        // Recursive function to print
        // the number in reversed form
        public static void Reverse(int num)
        {
                if(num <10) 
                {
                        System.out.print(num+"");
                        return;
                }
                else
                {
                        System.out.print(num%10+"");
                        Reverse(num/10);
                }

                
        }

        // driver code
        public static void main(String args[])
        {
                Scanner sc = new Scanner(System.in);
                
                int num = sc.nextInt();
                // calling recursive function
                // to print the number in
                // reversed form
                Reverse(num);
        }
}
