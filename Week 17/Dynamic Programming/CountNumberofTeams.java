class CountNumberofTeams {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int[] dpLess = new int[n];
        int count = 0;

        for(int j=0; j<n; j++)
        {
            for(int i = j-1; i >=0 ; i--)
            {
                if(rating[i] > rating[j])
                {
                    dpLess[j]++;
                    count += dpLess[i];
                }
            }
        }

        int[] dpGreater = new int[n];
        for(int j=0; j<n; j++)
        {
            for(int i = j-1; i >=0 ; i--)
            {
                if(rating[i] < rating[j])
                {
                    dpGreater[j]++;
                    count += dpGreater[i];
                }
            }
        }

        return count;

    }
}
