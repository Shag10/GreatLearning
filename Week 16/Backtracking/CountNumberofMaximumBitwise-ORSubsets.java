class CountNumberofMaximumBitwise-ORSubsets {
    int count=0;
    int max=0;
    public int countMaxOrSubsets(int[] nums) { 
      for(int num:nums){
          max |=num;
      }
      System.out.print(max);  
      backtrack(0,nums,0);
      return count;
    }
    void backtrack(int i,int [] nums,int ans){

        if(i==nums.length){
            if(ans==max)
              count++;
           return;
        }
         
        backtrack(i+1,nums,ans|nums[i]);
        backtrack(i+1,nums,ans);
    }
}
