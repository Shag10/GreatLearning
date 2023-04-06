class PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> answer = new HashSet<Integer>();
        if(bound < 2)
        {
            return new ArrayList<>(answer);
        }
        int maxPowerOfX = getLargestPowerSmallerThanNumber(x, bound);
        int maxPowerOfY = getLargestPowerSmallerThanNumber(y, bound);

        int[] yPowers = new int[maxPowerOfY+1];
        yPowers[0] = 1;
        for(int i=1; i<=maxPowerOfY; i++) {
            yPowers[i] = yPowers[i-1]*y;
        }

        int power = 1;
        for(int i=0; i<=maxPowerOfX; i++) {
            for(int j=0; j<=maxPowerOfY; j++) {
                int number = power + yPowers[j];
                if(number <= bound) answer.add(number);
            }
            power = power*x;
        }

        return new ArrayList<>(answer);
    }

    private int getLargestPowerSmallerThanNumber(int base, int bound)
    {
        if(base == 1 || bound <= 1) return 0;

        int power = 0;
        int number = 1;
        while(true)
        {
            if(number*base >= bound) return power;
            else {
                number = number*base;
                power = power + 1;
            }
        }
    }
    public static void main(String args[])
    {
        int x = 2;
        int y = 3;
        int bound = 10;
        ArrayList<Integer> ans = powerfulIntegers(x, y, bound);
        System.out.println(ans);
    }
}
