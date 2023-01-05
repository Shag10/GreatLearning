package Daily.Challenges.io;

import java.util.*;

public class Frequency {
	
	public static void calFrequency(int[] arr, int n)
	{
		HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for (int i=0;i<n;i++) {
			if (freqMap.containsKey(arr[i])) {
				freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
			}
			else {
				freqMap.put(arr[i], 1);
			}
    }
		for (Map.Entry entry : freqMap.entrySet()) {
			System.out.println("   " + entry.getKey() + "          " + entry.getValue());
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in Array: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Element    Frequency");
		calFrequency(arr, n);
		
		sc.close();
	}

}
