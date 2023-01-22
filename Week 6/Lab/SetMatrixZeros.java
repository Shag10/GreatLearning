package Week6.Lab;

public class SetMatrixZeros {
	
	static int firstRow = -1;
    static int firstColumn = -1;
    public static int[][] setZeroes(int[][] matrix) 
    {
	    for(int i=0; i<matrix.length; i++) {
	            for(int j=0; j<matrix[0].length; j++) {
	                if(matrix[i][j] == 0) {
	                    matrix[i][0] = 0;
	                    matrix[0][j] = 0;
	                    if(i==0) 
	                        firstColumn = 0;
	                    if(j==0)
	                        firstRow = 0;
	                }
	            }
	        }

        // set all the rows except 0th
        for(int i=1; i<matrix.length; i++) {
            if(matrix[i][0]==0) {
                for(int j=0; j<matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // set all the column except 0th
        for(int i=1; i<matrix[0].length; i++) {
            if(matrix[0][i]==0) {
                for(int j=0; j<matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        if(firstRow==0) {
            for(int i=0; i<matrix.length; i++)
                matrix[i][0] = 0;
        }

        if(firstColumn==0) {
            for(int i=0; i<matrix[0].length; i++)
                matrix[0][i] = 0;
        } 
        
        return matrix;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1, 1, 1},
				  {1, 0, 1},
				  {1, 1, 1}};

		System.out.println("Matrix before setting zeros");
		
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix after setting zeros");
		
		int[][] newMatrix = setZeroes(matrix);
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
