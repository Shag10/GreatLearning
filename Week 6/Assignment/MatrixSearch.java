import java.util.*;
class MatrixSearch{
  static public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
      return false;
    }

    int col = matrix[0].length - 1;
    int row = 0;
    while (col >= 0 && row <= matrix.length - 1) {
      if (target == matrix[row][col]) {
        return true;
      } else if (target < matrix[row][col]) {
        col--;
      } else if (target > matrix[row][col]) {
        row++;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int matrix[][] = new int[n][m];
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++) matrix[i][j] = sc.nextInt();
    }
    int target = sc.nextInt();
    if(searchMatrix(matrix, 3)) System.out.println(target+ " is in the matrix");
    else System.out.println(target+ " is not in the matrix");
  }
}
