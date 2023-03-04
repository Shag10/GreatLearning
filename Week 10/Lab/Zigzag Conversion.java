class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1) {
            return s;
        }
        StringBuilder answer = new StringBuilder();
        int i = 0;
        while(i<s.length()) {
            answer.append(s.charAt(i));
            i = i + (2 * numRows) - 2;
        }
        for(i=1; i<numRows-1; i++) {
            int j=i;
            boolean even = true;
            while(j<s.length()) {
            if(even) {
                answer.append(s.charAt(j));
                j = j + (2 * (numRows - i - 1));
            } 
            else {
                answer.append(s.charAt(j));
                j = j + (2 * i);
            }
            even = !even;
            }
        }
        while(i<s.length()) {
            answer.append(s.charAt(i));
            i = i + (2 * numRows) - 2;
        }
        return answer.toString();      
    }
}
