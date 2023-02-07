package Daily.Challenges.io;

import java.util.*;

public class WaysToAddParanthesis {
	
	public static List<Integer> diffWaysToAddParan(String expressions)
	{
		List<Integer> ans = new ArrayList<>();
		for(int i=0; i<expressions.length(); i++)
		{
			if(expressions.charAt(i) == '+' || expressions.charAt(i) == '-' || expressions.charAt(i) == '*')
			{
				String Part1 = expressions.substring(0, i);
				String Part2 = expressions.substring(i+1);
				
				List<Integer> part1Ans = diffWaysToAddParan(Part1);
				List<Integer> part2Ans = diffWaysToAddParan(Part2);
				
				for(Integer p1 : part1Ans)
				{
					for(Integer p2 : part2Ans)
					{
						int c = 0;
						switch(expressions.charAt(i))
						{
							case '+':
								c = p1+p2;
								break;
							case '-':
								c = p1-p2;
								break;
							case '*':
								c = p1*p2;
								break;
						}
						
						ans.add(c);
					}
				}
			}
		}
		if(ans.size() == 0) ans.add(Integer.valueOf(expressions));		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");

        String expressions = sc.nextLine();
        System.out.println("All possible ways to add parathesis to given expression are: "+diffWaysToAddParan(expressions));
        sc.close();
	}

}
