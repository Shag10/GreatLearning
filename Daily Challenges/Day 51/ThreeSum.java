package Daily.Challenges.io;

import java.util.*;

public class ThreeSum {
	
	public static void threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        for(int i = 0; i < nums.length-2; i++){
            int l = i+1;
            int r = nums.length-1;
            while(l < r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    
                    ans.add(temp);
                    l++;
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        System.out.println(ans);
        //return new ArrayList<>(ans);
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
		threeSum(nums);
		sc.close();
	}
}
