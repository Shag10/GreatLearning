import java.util.*;
public class TripletFinder {
  public static void findTriplet(int[] A) {
    // sort the given array in a natural order
    Arrays.sort(A);
    int n = A.length;

    // invalid input
    if (n <= 2) {
      System.out.print("No triplet exists. The array has less than 3 elements.");
    }

    // consider a maximum of the last three elements or
    // the first two elements and the last element
    if (A[n - 1] * A[n - 2] * A[n - 3] > A[0] * A[1] * A[n - 1]) {
      System.out.printf("Triplet is (%d, %d, %d)", A[n - 1], A[n - 2], A[n - 3]);
    } else {
      System.out.printf("Triplet is (%d, %d, %d)", A[0], A[1], A[n - 1]);
    }
  }

  public static void main(String[] args) {
    int arr[] = {4,-8,7,6,-5,1,0,9};
    findTriplet(arr);
  }

}
