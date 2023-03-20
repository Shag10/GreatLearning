import java.util.*;
public class ClosestSumtoX {

    public static void sumClosesttoX(int arr[], int n, int x)
    {
        int resl = 0, resr = 0;
        int closestSum = Integer.MAX_VALUE;
        int i=0, j=n-1;
        while(i < j)
        {
            if(Math.abs(arr[i] + arr[j] - x) < closestSum)
            {
                resl = i;
                resr = j;
                closestSum = Math.min(Math.abs(arr[i] + arr[j] - x), closestSum);
            
            }
            else if(arr[i] + arr[j] < x) i++;
            else j--;
        }
        System.out.println("The closest pair is " + arr[resl] + " and " + arr[resr]);
    }

    public static void main(String[] args) {
        //write your answer here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        sumClosesttoX(arr, n, x);
    }
}
