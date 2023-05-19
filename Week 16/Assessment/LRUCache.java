import java.util.*;
public class LRUCache 
{
    private Deque < Integer > dQueue;
    private HashSet < Integer > hashSet;
    private final int cache;
    LRUCache(int capacity) 
    {
        dQueue = new LinkedList <>();
        hashSet = new HashSet <>();
        cache = capacity;
    }
    public void refer(int page) 
    {
        if(!hashSet.contains(page)) 
        {
            if (dQueue.size() == cache) 
            {
                int last = dQueue.removeLast();
                hashSet.remove(last);
            }
        } 
        else 
        {
            dQueue.remove(page);
        }
        dQueue.push(page);
        hashSet.add(page);
    }
    public void display() 
    {
        Iterator<Integer> itr = dQueue.iterator();
        while (itr.hasNext()) 
        {
            System.out.print(itr.next() + " ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        LRUCache cache = new LRUCache(n);
        int t = in .nextInt();
        for (int i = 0; i < t; i++)
        cache.refer(in .nextInt());
        cache.display();
    }
}
