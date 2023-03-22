package Daily.Challenges.io;

public class PeakElementII 
{
	public static int[] findPeakGrid(int[][] mat) {
        int startRow = 0;
        int endRow = mat.length -1;
        while(startRow <= endRow) 
        {
            int midRow = startRow + (endRow - startRow)/2;
            int maxElementInmidRow = findMaxElementPosition(mat[midRow] , mat[midRow].length);
            if(midRow == 0) 
            {
                if(mat[midRow][maxElementInmidRow] > mat[midRow +1][maxElementInmidRow]) 
                {
                return new int[]{midRow,maxElementInmidRow};
                }
            }
            if(midRow == mat.length-1) 
            {
                if(mat[midRow][maxElementInmidRow] > mat[midRow -1][maxElementInmidRow]) 
                {
                    return new int[]{midRow,maxElementInmidRow};
                }
            }
            else if(midRow >0 && midRow < mat.length ) 
            {
                if(mat[midRow][maxElementInmidRow] > mat[midRow +1][maxElementInmidRow] && mat[midRow][maxElementInmidRow] > mat[midRow -1][maxElementInmidRow])
                return new int[]{midRow,maxElementInmidRow};
            }
            if(mat[midRow][maxElementInmidRow] < mat[midRow+1][maxElementInmidRow]) {
                startRow = midRow+1;
            }
            else endRow = midRow -1;
        }
        return new int[]{-1,-1};
    }
    public static int findMaxElementPosition(int[] arr, int n) 
    {
        int max = Integer.MIN_VALUE;
        int indx =0;
        for(int i = 0;i<n;i++) 
        {
            if(arr[i] > max) 
            {
                max = arr[i];
                indx =i;
            }
        }
        return indx;
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] mat = {{1,4}, {3,2}};
		int[] ans = new int[2];
		ans = findPeakGrid(mat);
		for(int i=0; i<ans.length; i++) System.out.print(ans[i] + " ");
	}
}
