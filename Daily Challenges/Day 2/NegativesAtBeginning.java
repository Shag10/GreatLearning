package Daily.Challenges.io;

import java.util.Scanner;

public class NegativesAtBeginning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in Array: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int left = 0;
		int right = left + 1;
		while(right < n)
		{
			if(arr[left] < 0)
			{
				left++;
				right = left +1;
			}
			else if(arr[left] > 0 && arr[right] < 0)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			else if(arr[left] > 0 && arr[right] > 0)
			{
				right++;
			}
		}
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+ " ");
		sc.close();
	}

}
