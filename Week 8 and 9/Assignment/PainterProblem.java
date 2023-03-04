class PainterProblem{

  static int sum(int arr[], int from, int to) {
    int total = 0;
    for (int i = from; i <= to; i++)
      total += arr[i];
    return total;
  }

  static int divide(int arr[], int n, int k) {
    if (k == 1)
      return sum(arr, 0, n - 1);
    if (n == 1)
      return arr[0];

    int ans = Integer.MAX_VALUE;

    for (int i = 1; i <= n; i++)
      ans = Math.min(ans, Math.max(divide(arr, i, k - 1),
        sum(arr, i, n - 1)));

    return ans;
  }

  public static void main(String args[]) {
    int arr[] = {10, 10, 10, 10};

    int n = arr.length;
    int k = 2;
    System.out.println(divide(arr, n, k));
  }
}



