public class SearchInMatrix{

  static boolean search(int arr[], int target, int n) {
    int low = 0;
    int high = n - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == target) {
        return true;
      }

      if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return false;
  }

  static boolean searchMatrix(int matrix[][], int target, int m, int n) {
    int low = 0;
    int high = m - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (target >= matrix[mid][0] &&
        target <= matrix[mid][n - 1]) {
        return search(matrix[mid], target, n);
      }

      if (target < matrix[mid][0]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return false;
  }

  public static void main(String args[]) {
    int matrix[][] = {
      {1,3,5,7},
      {10,11,16,20},
      {23,30,34,60}
    };
    int target = 3;
    System.out.println(searchMatrix(matrix, target, 3, 4));

  }
}


