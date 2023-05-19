import java.util.*;

class MaxProduct {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in .nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = in .nextInt();

    System.out.println(maxProductSubset(arr, n));
  }

  static int maxProductSubset(int a[], int n) {
    // Write your code here
    int countNeg = 0;
    for(int i=0; i<n; i++)
    {
      if(a[i] < 0) countNeg++;
    }
    int prod = 1;
    if(countNeg%2 == 0)
    {
      for(int i=0; i<n; i++)
      {
        if(a[i] == 0) continue;
        prod *= a[i];
      }
    }
    else if(countNeg%2 == 1)
    {
      Arrays.sort(a);
      for(int i=1; i<n; i++)
      {
        if(a[i] == 0) continue;
        prod *= a[i];
      }
    }

    return prod;
  }

}
