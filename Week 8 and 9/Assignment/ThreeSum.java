import java.util.*;

public class ThreeSum {
  public static ArrayList < ArrayList < Integer >> threeSum(int[] A) {
    ArrayList < ArrayList < Integer >> ans = new ArrayList < ArrayList < Integer >> ();
    Arrays.sort(A);
    for (int i = 0; i < A.length - 2; i++) {
      if (i == 0 || A[i] > A[i - 1]) {
        int l = i + 1, r = A.length - 1;
        while (l < r) {
          int sum = A[i] + A[l] + A[r];
          if (sum == 0) {
            ArrayList < Integer > al = new ArrayList < > ();
            al.add(A[i]);
            al.add(A[l]);
            al.add(A[r]);
            //if(!ans.contains(al))
            ans.add(al);
            //l++;r--;
            while (l < r && A[l] == A[l + 1])
              l++;
            while (r > l && A[r] == A[r - 1])
              r--;
            l++;
            r--;
          } else if (sum < 0) {
            l++;
          } else {
            r--;
          }
        }
      }
    }
    return ans;

  }

  public static void main(String[] args) {
    int arr[] = {4,-8,7,6,2,-5,-4,1,0,9};
    ArrayList < ArrayList < Integer >> ans = threeSum(arr);
    for (ArrayList tmp: ans)
      System.out.println(tmp);
  }

}

