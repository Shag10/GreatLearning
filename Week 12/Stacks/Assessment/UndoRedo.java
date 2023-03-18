import java.util.*;
public class UndoRedo {
  static Stack<Character> undo = new Stack<>();
  static Stack<Character> redo = new Stack<>();

  static void WRITE(Stack<Character> undo, char x)
  {
    undo.push(x);
  }

  static void UNDO(Stack<Character> undo, Stack<Character> redo)
  {
    char x = (char)undo.peek();
    undo.pop();
    redo.push(x);
  }

  static void REDO(Stack<Character> undo, Stack<Character> redo)
  {
    char x = (char)redo.peek();
    redo.pop();
    undo.push(x);
  }

  static void READ(Stack<Character> undo)
  {
    Stack<Character> order = new Stack<>();
    while(undo.size() > 0)
    {
      order.push(undo.peek());
      undo.pop();
    }
    while(order.size() > 0)
    {
      System.out.print(order.peek());
      undo.push(order.peek());
      order.pop();
    }
    System.out.print(" ");
  }
  static void RunQueries(String[] input) {
   int n = input.length;
   for(int i=0; i<n; i++)
   {
     if(input[i] == "UNDO") UNDO(undo, redo);
     else if(input[i] == "REDO") REDO(undo, redo);
     else if(input[i] == "READ") READ(undo);
     else WRITE(undo, input[i].charAt(6));
   }
  }

  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int n=s.nextInt();
     s.nextLine();
     
    String[] array = new String[n];


    for (int i = 0; i < n; i++) {
        array[i] = s.nextLine();
    }

    RunQueries(array);
  }
}
