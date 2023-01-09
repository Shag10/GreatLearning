import java.util.*;

class PerfectSquare
{
    public static boolean perfectSqaure(int num)
    {
        boolean flag = false;
        for(int i=0; i<=num/2; i++)
        {
            int x = i*i;
            if(x == num)
            {
                flag = true;
                break;
            }
            else if(num < x)
            {
                flag = false;
                break;
            }
            else continue;
        }
        return flag;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(perfectSqaure(num) == true)
            System.out.println(num+" is a valid square");
        else
            System.out.println(num+" is not a valid square");
    }
}
