// Lab12bvst.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.



import java.util.ArrayList;

public class Lab12bst
{
	public static void main(String[] args)
	{   
      Deck deck = new Deck();
      System.out.println(deck);
	}
}


class Deck 
{
	private ArrayList<Card> cards;
	private int size;

	public Deck() 
   {
      size = 52;
      cards = new ArrayList<Card>();
	    String[] suits ={"SPADE","HEART","CLUB","DIAMOND"};
	    String[] ranks ={"JOKER","ACE","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};
	    for (int i = 0; i < 4; i++) 
	    {
            for (int v = 2; v < 15; v++) 
            {
                int z;
                int a = 0;
                	z = a;
                if (v >= 10 && v != 14) 
                {
                    a = 10;
                } 
                else if (v == 14) 
                {
                	
                    a = 11;
                }
                cards.add(new Card(suits[i], ranks[v], a));
            }
        }
        Shuffle();
}
	
	private void Shuffle()
	{
		 ArrayList<Card> cards2 = (ArrayList<Card>) cards.clone();
		 
	        ArrayList<Integer> ranks = new ArrayList();
	        
	        for(int i = 0; i < 52; i++)
	        {
	            int star;
	            star = (int)(Math.random()*(cards2.size() -1));
	            
	            ranks.add(star);
	        }
	        for (int x = 0; x < 52; x++) 
	        {
	            int star;
	            star = (int)(Math.random()*(cards2.size()-1));
	            cards.set(ranks.remove(star) , (Card)cards2.remove(star));
	        }

	}
	

	public String toString()
{
	String print = "";
	for(int i = 0; i<=51; i++)
	{
		print = print+cards.get(i).toString()+"\n";
	}
	return print;
}
	

}