package Daily.Challenges.io;

public class MinMaxNodesBetweenCritical {
	public static int[] nodesBetweenCriticalPoints(Node head) {
        int res[]=new int[]{-1,-1};
        if(head==null||head.next==null||head.next.next==null) return res;
        int minidx=Integer.MAX_VALUE,curridx=-1,lastidx=-1;
        Node prev=head,ptr=head.next;
        int idx=1,minD=Integer.MAX_VALUE;
        while(ptr!=null&&ptr.next!=null){
            if((ptr.data>prev.data&&ptr.data>ptr.next.data)||(ptr.data<prev.data&&ptr.data<ptr.next.data))
            {
                if(idx<minidx) minidx=idx;
                lastidx=curridx;
                curridx=idx;
                if(lastidx!=-1&&curridx-lastidx<minD) minD=curridx-lastidx;
            }   
            prev=ptr;
            ptr=ptr.next;
            idx++;
        }
        if(lastidx==-1) return res;
        else
        {
        res[0]=minD;
        res[1]=curridx-minidx;
        }
        return res;
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
        Node head = new Node(5);
                head.next = new Node(3);
                head.next.next = new Node(1);
                head.next.next.next = new Node(2);
                head.next.next.next.next = new Node(5);
                head.next.next.next.next.next = new Node(1);
                head.next.next.next.next.next.next = new Node(2);
        printList(head);
        int[] ans = new int[2];
        ans = nodesBetweenCriticalPoints(head);
        for(int i=0; i<2; i++)
        	System.out.print(ans[i]+" ");
    }
}
