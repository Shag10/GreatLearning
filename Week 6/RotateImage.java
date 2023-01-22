package Week6.Lab;

public class RotateImage {
	
	public static int[][] rotate(int[][] matrix) {
        int n = matrix .length;
        transpose(matrix, n);
        reverse(matrix, n);
        
        return matrix;
    }
    public static void transpose(int[][] matrix, int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] matrix, int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n/2; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1, 2, 3},
						  {4, 5, 6},
						  {7, 8, 9}};
		
		System.out.println("Old Matrix");
		
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("New Matrix");
		
		int[][] newMatrix = rotate(matrix);
		for(int i=0; i<newMatrix.length; i++)
		{
			for(int j=0; j<newMatrix[0].length; j++)
			{
				System.out.print(newMatrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
