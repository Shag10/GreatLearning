import java.util.Scanner;

public class ModularExponentiation {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int base = sc.nextInt();
    int expo = sc.nextInt();  
    int mod = sc.nextInt();  
  
    int res;

    System.out.printf("%d", power(base,expo)%mod);


   }
    static int power(int x, int y)
    {
    int res = 1;  
 
    while (y > 0)
    {
        if ((y & 1) != 0)
            res = res * x;

        y = y >> 1;
        x = x * x; 
    }
    return res;
    }
}
