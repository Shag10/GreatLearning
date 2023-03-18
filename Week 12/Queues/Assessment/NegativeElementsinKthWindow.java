import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

class NegativeElementsinKthWindow {
    
    public static void printFirstNegativeInteger(int arr[], int N, int K)
    {
      //write your code here
      int firstNegIdx = 0;
      int firstNegEle;

      for(int i = K-1; i < N; i++)
      {
        while((firstNegIdx < i) && (firstNegIdx <= i-K || arr[firstNegIdx] >= 0))
        {
          firstNegIdx++;
        }
        if(arr[firstNegIdx] < 0) firstNegEle = arr[firstNegIdx];
        else firstNegEle = 0;
        System.out.print(firstNegEle + " ");
      }
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    int n=scan.nextInt();
    int k=scan.nextInt();
    int[]arr= new int[n];
    for(int i=0;i<n;i++){
    arr[i]=scan.nextInt();
    }
    printFirstNegativeInteger(arr,n,k);
  }
    
}
