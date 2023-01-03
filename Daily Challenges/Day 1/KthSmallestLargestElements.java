package Daily.Challenges.io;
import java.util.*;

public class KthSmallestLargestElements {
	public static void KthLargestSmallest(int[] arr, int n, int k)
	{
		Arrays.sort(arr);
		
		System.out.println("Kth smallest element is "+arr[k-1]);
		System.out.println("Kth largest element is "+arr[n-k]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to insert in array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements into array");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value of K");
		int k = sc.nextInt();
		KthLargestSmallest(arr, n, k);
		sc.close();

	}

}
