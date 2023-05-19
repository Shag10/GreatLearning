import java.util.*;

class ContainerWithMostWater {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++)
	        arr[i]=in.nextInt();
		System.out.println(maxArea(arr));
	}
	
	static int maxArea(int[] arr) {
        // Write your code here
		int i=0,j=arr.length-1,ans=Integer.MIN_VALUE;
		while(i<j)
		{
			int currentArea = Math.min(arr[i],arr[j])*(j-i);
			ans=Math.max(ans,currentArea);
			if(arr[i]<arr[j]) i++;
			else j--;
		}
		return ans;
    }
}

