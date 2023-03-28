import java.util.* ;
import java.io.*; 
public class StockSpans {
    public static int[] findStockSpans(int[] prices) {
		// Write your code here.
		Stack<Integer> st = new Stack<>();
		int n = prices.length; 
		int[] ans = new int[n];
		st.push(0);
		ans[0] = 1;
		for(int i = 1; i<n; i++)
		{
			while(!st.isEmpty() && prices[i] > prices[st.peek()])
			{
				st.pop();
			}

			ans[i] = st.isEmpty() ? i+1 : i - st.peek();
			st.push(i);
		}
		return ans;
	}
}
