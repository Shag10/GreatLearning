package Daily.Challenges.io;

import java.util.*;

public class SpellsAndPotions {
	
	public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        for(int i=0; i<spells.length; i++)
        {
            int left = 0, right = potions.length;
            while(left < right)
            {
                int mid = left + (right - left)/2;
                if(spells[i]*potions[mid] >= success) right = mid;
                else left = mid + 1;
            }
            spells[i] = potions.length - left;
        }
        return spells;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of spells");
		int n = sc.nextInt();
		int[] spells = new int[n];
		System.out.println("Enter size of potions");
		int m = sc.nextInt();
		int[] potions = new int[m];
		System.out.println("Enter number of spells: ");
		for(int i=0; i<n; i++)
		{
			spells[i] = sc.nextInt();
		}
		System.out.println("Enter number of potions: ");
		for(int i=0; i<n; i++)
		{
			potions[i] = sc.nextInt();
		}
		System.out.println("Enter success amount: ");
		long success = sc.nextLong();
		System.out.println("Number of successfull pairs spells and potions are: ");
		int[] ans  = new int[n];
		ans = successfulPairs(spells, potions, success);
		for(int i=0; i<n; i++) System.out.print(ans[i] + " ");
		sc.close();
	}
}
