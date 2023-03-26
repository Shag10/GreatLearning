package Daily.Challenges.io;

import java.util.*;

public class StringContainsAllBinaryCodesofSizeK {
	
	public static boolean hasAllCodes(String s, int k) {
        Set<String> codes = new HashSet<>();
        int tot = 1 << k;
        for(int i=0; i+k<=s.length(); i++)
        {
            codes.add(s.substring(i, i+k));
            if(codes.size() == tot) return true;
        }

        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        System.out.println("Enter size: ");
        int k = sc.nextInt();
        if(hasAllCodes(s, k)) System.out.println("Given string contains all binary hash codes");
        else System.out.println("Given string does not contain all binary hash codes");
        sc.close();
	}
}
