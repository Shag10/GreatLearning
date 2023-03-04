import java.util.*;
class RomanToInteger {
    // Finds decimal value of a given roman numeral
    static int value(char c)
    {
        int val = 0;
        switch(c)
        {
            case 'I': val = 1; break;
            case 'V': val = 5; break;
            case 'X': val = 10; break;
            case 'L': val = 50; break;
            case 'C': val = 100; break;
            case 'D': val = 500; break;
            case 'M': val = 1000; break;
        }
        return val;
    }
    static int romanToDecimal(String s) {
        int nums = 0;
        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            if(i < s.length()-1 && value(curr) < value(s.charAt(i+1)))
            {
                nums += value(s.charAt(i+1)) - value(curr);
                i++;
            }
            else
                nums += value(curr);
        }
        return nums;
       
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      System.out.println(romanToDecimal(s));
    }
}
