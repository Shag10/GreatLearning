class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        int start=0,end=tokens.length-1;
        Arrays.sort(tokens);
        int curScore=0;
        int maxScore=0;
        while(start<=end)
        {
            if(power>=tokens[start]){
                curScore++;
                maxScore=Math.max(maxScore, curScore);
                power-=tokens[start++];
            }
            else if(curScore>0){
            power+=tokens[end--];
            curScore--;
            }
            else break;
        }
        return maxScore;
    }
}
