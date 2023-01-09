import java.util.*;

class LCM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


        int lcm;
        if(n1>n2) lcm = n1;
        else lcm = n2; 

        while(n1 != 0)
        {
            if(lcm%n1 == 0 && lcm%n2 == 0)
            {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}
