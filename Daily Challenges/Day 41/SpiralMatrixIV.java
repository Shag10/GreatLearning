package Daily.Challenges.io;

import java.util.*;

public class SpiralMatrixIV {
	
	public static int[][] spiralMatrix(int m, int n, Node head) {
        int[][] matrix = new int[m][n];

        for(int[] row : matrix) Arrays.fill(row, -1);

        if(head == null) return matrix;

        Node curr = head;
        int rowBegin = 0;
        int rowEnd = m-1;
        int colBegin = 0;
        int colEnd = n-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd)
        {
            for(int j=colBegin; j<=colEnd; j++)
            {
                if(curr != null)
                { 
                    matrix[rowBegin][j] = curr.data;
                    curr = curr.next;
                }
            }
            rowBegin++;

            for(int j=rowBegin; j<=rowEnd; j++)
            {
                if(curr != null)
                { 
                    matrix[j][colEnd] = curr.data;
                    curr = curr.next;
                }
            }
            colEnd--;
            if(rowBegin <= rowEnd)
            {
                for(int j=colEnd; j>=colBegin; j--)
                {
                    if(curr != null)
                    { 
                        matrix[rowEnd][j] = curr.data;
                        curr = curr.next;
                    }
                }
                rowEnd--;
            }
            if(colBegin <= colEnd)
            {
                for(int j=rowEnd; j>=rowBegin; j--)
                {
                    if(curr != null)
                    { 
                        matrix[j][colBegin] = curr.data;
                        curr = curr.next;
                    }
                }
                colBegin++;
            }
        }
        return matrix;
    }
	
	static void printList(Node head)
    {
        while (head.next != null) {
            System.out.print(head.data + "-> ");
            head = head.next;
        }
        System.out.println(head.data);
    }
 
    public static void main(String[] args)
    {
    	int m= 3;
    	int n= 5;
        Node head = new Node(3);
                head.next = new Node(0);
                head.next.next = new Node(2);
                head.next.next.next = new Node(6);
                head.next.next.next.next = new Node(8);
                head.next.next.next.next.next = new Node(1);
                head.next.next.next.next.next.next = new Node(7);
                head.next.next.next.next.next.next.next = new Node(9);
                head.next.next.next.next.next.next.next.next = new Node(4);
                head.next.next.next.next.next.next.next.next.next = new Node(2);
                head.next.next.next.next.next.next.next.next.next.next = new Node(5);
                head.next.next.next.next.next.next.next.next.next.next.next = new Node(5);
                head.next.next.next.next.next.next.next.next.next.next.next.next = new Node(0);
        printList(head);
        int[][] ans = new int[m][n]; 
        ans = spiralMatrix(m, n, head);
        for(int i=0; i<m; i++)
        {
        	for(int j=0; j<n; j++)
        	{
        		System.out.print(ans[i][j] + " ");
        	}
        	System.out.println();
        }
        
    }
}
