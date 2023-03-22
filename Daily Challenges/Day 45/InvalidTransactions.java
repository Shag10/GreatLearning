package Daily.Challenges.io;

import java.util.*;
class Pair{
    String name;
    int time;
    int amount;
    String city;
    int index;
    
    Pair(String name, int time, int amount, String city, int index){
        this.name= name;
        this.time= time;
        this.amount= amount;
        this.city= city;
        this.index= index;
    }
}
public class InvalidTransactions {
	
    public static List<String> invalidTransactions(String[] transactions) 
    {
        List<String> result= new ArrayList<>();
        List<Pair> deals= new ArrayList<>();
        int index= 0;
        for(String s: transactions)
        {
            String[] temp= s.split(",");
            Pair p1= new Pair(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), temp[3], index);
            deals.add(p1);
            index++;
        }
        Collections.sort(deals, (p1, p2) ->{
            if( p1.name.compareTo(p2.name) > 0 ) return 1; 
            else if( p1.name.compareTo(p2.name) < 0 ) return -1;       
            else
            {
                if(p1.time < p2.time) return -1;    
                else if(p1.time > p2.time) return 1;
                else
                {
                    if(p1.amount< p2.amount) return -1;
                    else if(p1.amount > p2.amount) return 1;
                    else 
                    {
                        if( p1.city.compareTo(p2.city) > 0 ) return 1;
                        else if( p1.city.compareTo(p2.city) > 0 ) return -1;
                        else return 0;
                    }
                }
            }
        });

        HashSet<Integer> hs= new HashSet<>();
        for(int i=0; i<deals.size(); i++)
        {
            Pair p1= deals.get(i);
            if(p1.amount > 1000)
            {
                if(hs.contains(p1.index) == false)
                {
                    result.add(transactions[p1.index]);
                    hs.add(p1.index);
                }
            }
            for(int j=i+1; j<deals.size(); j++)
            {
                Pair p2= deals.get(j);
                if(p1.name.equals(p2.name))
                {
                    if(p2.time <= p1.time+60 && !p1.city.equals(p2.city))
                    {
                        if(hs.contains(p1.index) == false)
                        {
                            result.add(transactions[p1.index]);
                            hs.add(p1.index);
                        }
                        if(hs.contains(p2.index) == false)
                        {
                            result.add(transactions[p2.index]);
                            hs.add(p2.index);
                        }
                    }
                }
            }
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] transactions = {"alice,20,800,mtv","alice,50,100,beijing"};
		List<String> result= new ArrayList<>();
		result = invalidTransactions(transactions);
		for(int i=0; i<result.size(); i++) System.out.println(result.get(i));
	}

}
