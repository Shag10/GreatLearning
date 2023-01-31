package Daily.Challenges.io;

import java.util.*;

public class PossibleExpression {
	
	static void getExprUtil(ArrayList<String> res, String curExp, String input, int target, int pos, int curVal, int last)
	{
		if (pos == input.length()) {
			if (curVal == target)
				res.add(curExp);
			return;
		}

		for (int i = pos; i < input.length(); i++) {
			if (i != pos && input.charAt(pos) == '0')
				break;

			String part = input.substring(pos, i + 1);
			int cur = Integer.parseInt(part);
			if (pos == 0)
				getExprUtil(res, curExp + part, input, target, i + 1, cur, cur);
			else {
				getExprUtil(res, curExp + "+" + part, input, target, i + 1, curVal + cur, cur);
				getExprUtil(res, curExp + "-" + part, input, target, i + 1, curVal - cur, -cur);
				getExprUtil(res, curExp + "*" + part, input, target, i + 1, curVal - last + last * cur, last * cur);

			}
		}
	}

	static ArrayList<String> getExprs(String input, int target)
	{
		ArrayList<String> res = new ArrayList<String>();
		getExprUtil(res, "", input, target, 0, 0, 0);
		return res;
	}

	static void printResult(ArrayList<String> res)
	{
		for (int i = 0; i < res.size(); i++)	
			System.out.print(res.get(i) + " ");	
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string containg numbers only:");
		String s = sc.nextLine();
		System.out.println("Enter target value:");
		int target = sc.nextInt();
		ArrayList<String> res = getExprs(s, target);
		System.out.println("All possible expressions are:");
		printResult(res);
		sc.close();
	}
}
