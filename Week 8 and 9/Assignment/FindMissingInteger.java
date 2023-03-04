import java.util.*;
class FindMissingInteger {
  static int search(int ar[], int size) {
    int sumCal = (size+1)*(size+2)/2;
    int sumMis = 0;
    for(int i=0; i<size; i++) sumMis += ar[i];
    if(sumCal-sumMis == 0) return size+2;
    return sumCal-sumMis;
    
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    System.out.println(search(arr, arr.length));
  }
}
