import java.util.*;
class Temperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
       //write your code here
       int n = temperatures.length;
       int[] ans = new int[n];
       Stack<Integer> st = new Stack<>();
       Arrays.fill(ans, 0);
       for(int i = 0; i < n; i++)
       {
         while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i])
         {
           ans[st.peek()] = i - st.peek();
           st.pop();
         }
         st.push(i); 
       }

       return ans;
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    int n=scan.nextInt();
    int[]arr= new int[n];
    for(int i=0;i<n;i++){
    arr[i]=scan.nextInt();
    }

    int[]ans=dailyTemperatures(arr);
    for(int i=0;i<n;i++){
    System.out.print(ans[i]+" ");
    }

    
  }
}
