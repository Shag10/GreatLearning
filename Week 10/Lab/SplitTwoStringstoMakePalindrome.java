class SplitTwoStringstoMakePalindrome {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }
    public boolean check(String a, String b) {
        int i = 0;
        int j = a.length()-1;
        while(i<j && a.charAt(i)==b.charAt(j)) {
            i++;
            j--;
        }
        if(i==j) {
            return true;
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }
    public boolean isPalindrome(String a, int start, int end) {
        while(start<=end) {
            if(a.charAt(start) != a.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
