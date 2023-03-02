class FlipStringtoMonotoneIncreasing {
    public static int minFlipsMonoIncr(String s) {
        int countofZeros = 0;
        int totalZeros = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '0') totalZeros++;
        }
        int min = totalZeros;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '0') countofZeros++;
            int flip = i+1 - countofZeros;
            flip = flip + totalZeros - countofZeros;
            min = Math.min(flip, min);
        }

        return min;
    }
    public static vid main(String[] args)
    {
        String s = "00110";
        System.out.println(minFlipsMonoIncr(s));
    }
}
