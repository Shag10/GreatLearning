import java.util.*;
class ExcelSheetColumnNumber {
    static int excelColumnNumber(String s) {
      int ans = 0;
      for(int i=0; i<s.length(); i++)
      {
        ans *= 26;
        ans += s.charAt(i) - 'A' + 1;
      }
      return ans;
      
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      System.out.println(excelColumnNumber(s));
    }
}
