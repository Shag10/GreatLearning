package Week6.Lab;

import java.util.Scanner;

public class PivotIndex {
	
	public static int pivotIndex(int[] nums) {
        int allSum = 0;
        int leftSum = 0;
        for(int i=0; i<nums.length; i++)
            allSum += nums[i];

        for(int i=0; i<nums.length; i++)
        {
            allSum -= nums[i];
            if(leftSum == allSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter elements in Array: ");
		for(int i=0; i<n; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println("Pivot index is: "+pivotIndex(nums));
		sc.close();

	}

}
