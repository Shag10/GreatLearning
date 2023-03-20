class DeckRevealedIncreasing {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n= deck.length;
        Arrays.sort(deck);
        Queue<Integer> q= new LinkedList<>();
        for (int i=0; i<n; i++) q.add(i);
        int[] res= new int[n];
        for (int i=0; i<n; i++){
            res[q.poll()]=deck[i];
            q.add(q.poll());
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        int[] deck = {17,13,11,2,3,5,7}
        int[] ans = new int[deck.length];
        
        for(int i=0; i<deck.length; i++) System.out.print(ans[i] + " ");
    }
}
