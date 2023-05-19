import java.util.*;

class MaximizeProduct {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in .nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = in .nextInt();

    System.out.println(maxSum(arr, n));
  }

  static int maxSum(int arr[], int n) {
    //Write your code here
    Arrays.sort(arr);
    int sum = 0;
    for(int i=0; i<n; i++)
    {
      sum += arr[i]*i;
    }

    return sum;
  }

}
