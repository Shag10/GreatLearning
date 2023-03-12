import java.util.*;
class TargetSum {
 
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
       int n= scan.nextInt();
       int m=scan.nextInt();
       int[] A = new int[n];
       int[]B=new int[m];
       int target=scan.nextInt();
     
 
       for (int i = 0; i < n; i++) {
           A[i] = scan.nextInt();
       }
       for (int i = 0; i < m; i++) {
           B[i] = scan.nextInt();
       }
  

    findAllPairsWithSumX(A, B, A.length, B.length, target);
  }

  public static void findAllPairsWithSumX(int A[], int B[],
    int n, int m, int targetSum) {
    // write your code here
    //also print the output
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int i=0; i<n; i++)
    {
      hm.put(A[i], 0);
    }
    for(int j=0; j<m; j++)
    {
      if(hm.containsKey(targetSum - B[j])) 
        System.out.println(targetSum - B[j] + " " + B[j]);
    }

  }
}
