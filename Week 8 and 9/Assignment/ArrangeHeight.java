
import java.util.*;

public class ArrangeHeight {
  static int[] partition(int array[]) {

    int low = 0, high = array.length - 1;
    // choose the rightmost element as pivot
    int pivot = array[high];

    // pointer for greater element
    int i = (low - 1);

    // traverse through all elements
    // compare each element with pivot
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {

        // if an element smaller than pivot is found
        // swap it with the greater element pointed by i
        i++;

        // swapping element at i with an element at j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    // swap the pivot element with the greater element specified by i
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    // return the position from where the partition is done
    return array;
  }

  public static void main(String[] args) {
    int arr[] = {7, 1, 2, 4, 9, 15, 8, 5 };
    arr = partition(arr);
    for (int temp: arr)
      System.out.println(temp);
  }

}
