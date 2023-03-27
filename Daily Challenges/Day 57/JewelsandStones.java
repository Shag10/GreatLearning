package Daily.Challenges.io;

import java.util.*;

public class JewelsandStones {
	
	public static int numJewelsInStones(String jewels, String stones) {
        Set<Integer> hs = new HashSet<>();
        int count = 0;
        for(int i: jewels.toCharArray()) hs.add(i);

        for(int j : stones.toCharArray())
        {
            if(hs.contains(j)) count++;
        }

        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Jewels");
        String jewels = sc.nextLine();
        System.out.println("Enter Stones");
        String stones = sc.nextLine();
        System.out.println("Number of Jewels in Stones are "+numJewelsInStones(jewels, stones));
        sc.close();
	}
}
