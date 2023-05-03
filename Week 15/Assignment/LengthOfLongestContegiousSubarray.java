import java.util.*;
public class Main {

    public static void longestIncresingSubarray(int n, int[] arr)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxLen = 0;
        int len = 0;
        int initPos = 0;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i] >= arr[i+1])
            {
                hm.put(initPos, len);
                initPos = i+1;
                len = 0;
            }
            else len++;
        }
        for(Map.Entry<Integer, Integer> ent : hm.entrySet())
        {
            if(maxLen < ent.getValue()) maxLen = ent.getValue();
        }
        if(maxLen > 0) System.out.println(maxLen+1);
        else System.out.println(0);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        longestIncresingSubarray(n, arr);
    }
}
