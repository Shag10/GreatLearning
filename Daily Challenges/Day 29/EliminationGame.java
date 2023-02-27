package Daily.Challenges.io;

import java.util.*;

public class EliminationGame {
	
	public static int lastRemainingBetter(int n)
	{
		int head = 1;
		int remaining = n;
		boolean left = true;
		int step = 1;
		
		while(remaining > 1)
		{
			if(left || remaining%2 == 1)
			{
				head = head + step;
			}
			remaining /= 2;
			step *= 2;
			left = !left;
			
		}
		return head;
	}
	
	public static void getLastRemaining(ArrayList<Integer> list)
	{
		if(list.size() == 1) return;
		int index = 0;
		//Left to right
		while(index < list.size() && list.size() > 1)
		{
			list.remove(index);
			index++;
		}
		//Right to left
		index = list.size() - 1;
		while(index >= 0 && list.size() > 1)
		{
			list.remove(index);
			index = index - 2;
		}
		getLastRemaining(list);
		return;
	}
	
	public static int lastRemaining(int n)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) list.add(i);
		getLastRemaining(list);
		return list.get(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("Result is: "+lastRemaining(n));
		System.out.println("Result is: "+lastRemainingBetter(n));
		sc.close();
	}

}
