package Daily.Challenges.io;

import java.util.*;

public class JumpGameVII {
	
	public static boolean jump(String s, int minJump, int maxJump)
	{
		int n = s.length();
        if(s.charAt(n-1) == '1') return false;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int maxRange = 0;
        while(!q.isEmpty())
        {
            int i = q.poll();
            int l = Math.max(i + minJump, maxRange);
            int r = Math.min(i + maxJump, n-1);
            for(int x=l; x<=r; x++)
            {
                if(x == n-1) return true;
                if(s.charAt(x) == '0') q.add(x);

            }
            maxRange = r + 1;
        }
        return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String which contains only binary numbers");
		String s = sc.next();
		System.out.println("Enter minimum jumps given: ");
		int minJump = sc.nextInt();
		System.out.println("Enter maximum jumps given: ");
		int maxJump = sc.nextInt();
		System.out.println("Whether jump is possible: "+jump(s, minJump, maxJump));
		sc.close();
	}
}
