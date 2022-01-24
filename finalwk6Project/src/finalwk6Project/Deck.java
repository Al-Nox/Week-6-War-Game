package finalwk6Project;

import java.util.ArrayList;

public class Deck {
	public ArrayList<Card> cards = new ArrayList<Card>();
	
	public Deck()
    {
		for(int i = 2; i < 15; i++)
		{
			for(int j = 0; j <= 3; j++) // nested for loop
			{ 	
				
				cards.add(new Card(i, j));

			}
		}
    }

    public void shuffle()
    {
    	
    	ArrayList<Card> shuffle =new ArrayList<>();
    	while(cards.size() > 0)
    	{
    		int index = (int) (cards.size() * Math.random()); //casts the whole thing into an integer after it multiplies 
    	
        	shuffle.add(cards.get(index));
        	cards.remove(index);
    	}
    	
    	cards =  shuffle;
    	// create a new array list instance 
    }

    public Card Draw()
    {
    	Card c = cards.get(0);
    	cards.remove(0);
    	return c;
    }
	
}
