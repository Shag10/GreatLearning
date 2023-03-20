import java.util.*;

class MergeTwoSortedArray
{
    public static void mergeArrays(int[] nums1, int[] nums2, int m, int n, int[] nums3)
    {
        int i=0, j=0, k=0;
        while(i < m && j < n)
        {
            if(nums1[i] < nums2[j]) nums3[k++] = nums1[i++];
            else nums3[k++] = nums2[j++];
        }
        while(i < m) nums3[k++] = nums1[i++];
        while(j < n) nums3[k++] = nums2[j++];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for(int i=0; i<m; i++) nums1[i] = sc.nextInt();
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for(int j=0; j<n; j++) nums2[j] = sc.nextInt();
        int[] nums3 = new int[m+n];
        mergeArrays(nums1, nums2, m, n, nums3);
        for(int k=0; k<m+n; k++) System.out.print(nums3[k] + " ");
    }
}
