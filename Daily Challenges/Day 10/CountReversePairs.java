package Daily.Challenges.io;

import java.util.*;

public class CountReversePairs {
	
	static int merge(int[] nums, int low, int mid, int high) 
	{
		int cnt = 0;
		int j = mid + 1;
		for(int i = low;i<=mid;i++) 
		{
			while(j<=high && nums[i] > (2 * (long) nums[j])) 
			{
				j++;
			}
		cnt += (j - (mid+1));
		}
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low, right = mid+1;
		while(left <= mid && right<=high) 
		{
			if(nums[left]<=nums[right])
				temp.add(nums[left++]);
			else 
				temp.add(nums[right++]);
		}

		while(left<=mid) 
		{
			temp.add(nums[left++]);
		}
		while(right<=high) 
		{	
			temp.add(nums[right++]);
		}
			
		for(int i = low; i<=high;i++) 
		{
			nums[i] = temp.get(i - low);
		}
		return cnt;
	}

	static int mergeSort(int[] nums, int low, int high) 
	{
		if(low>=high) return 0;
		int mid = (low + high) / 2;
		int inv = mergeSort(nums, low, mid);
		inv += mergeSort(nums, mid+1, high);
		inv += merge(nums, low, mid, high);
		return inv;
	}

	static int reversePairs(int[] nums, int n) 
	{
		return mergeSort(nums, 0, n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in Array: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The Total Reverse Pairs are "+reversePairs(arr, n));
		sc.close();
	}

}
