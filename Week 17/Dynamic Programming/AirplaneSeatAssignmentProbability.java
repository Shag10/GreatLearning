class AirplaneSeatAssignmentProbability {
    public double nthPersonGetsNthSeat(int n) {
        if(n == 1) return 1;
        double[] memo = new double[n+1];

        for(int i=2; i<memo.length; i++)
        {
            memo[i] = (1/(1.0*i)) + ((i-2)/(1.0*i))*memo[i-1];
        }

        return memo[n];
    }
}
