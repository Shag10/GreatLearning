public class LocksAndkeysMatch
{
    public static void main(String[] args)
    {
        // Locks and keys are represented as an array of characters
        char Locks[] = {'@', '#', '$', '%', '^', '&'};
        char keys[] = {'$', '%', '&', '^', '@', '#'};
 
        // Method based on quick sort which matches Locks and keys
        matchPairs(Locks, keys, 0, 5);
 
        System.out.println("Matched Locks and keys are : ");
        printArray(Locks);
        printArray(keys);
    }
 
    // Method to print the array
    private static void printArray(char[] arr) {
        for (char ch : arr){
            System.out.print(ch + " ");
        }
        System.out.print("\n");
    }
 
    // Method which works just like a quick sort
    private static void matchPairs(char[] Locks, char[] keys, int low,
                                                              int high)
    {
        if (low < high)
        {
            // Choose the last character of the keys array for the locks partition.
            int pivot = partition(Locks, low, high, keys[high]);
 
            // Now using the partition of Locks choose that for keys
            // partition.
            partition(keys, low, high, Locks[pivot]);
 
            // Recur for [low...pivot-1] & [pivot+1...high] for Locks and
            // keys array.
            matchPairs(Locks, keys, low, pivot-1);
            matchPairs(Locks, keys, pivot+1, high);
        }
    }
 
    private static int partition(char[] arr, int low, int high, char pivot)
    {
        int i = low;
        char temp1, temp2;
        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot){
                temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
            } else if(arr[j] == pivot){
                temp1 = arr[j];
                arr[j] = arr[high];
                arr[high] = temp1;
                j--;
            }
        }
        temp2 = arr[i];
        arr[i] = arr[high];
        arr[high] = temp2;
        return i;
    }
}
