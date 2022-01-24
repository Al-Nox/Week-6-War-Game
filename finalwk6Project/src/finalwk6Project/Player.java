package finalwk6Project;

import java.util.ArrayList;

public class Player {
// set player score to a variable as it always changes  start @ 0 
	public ArrayList<Card> Hand = new ArrayList<>(); //creates a new array list and assigned it to Hand
	public int Score = 0;
	public String Name; 
	public Player(String name)
	{
		Name = name;
	}
	public void Describe()
	{
		System.out.println("Player " + Name + " has a score of " + Score);
	}
	
	public Card Flip() 
	{
		Card c = Hand.get(0);
		Hand.remove(0);
		return c;
	}
	
	public void Draw(Deck deck)
	{
		Hand.add(deck.Draw());
	}
	
	public void IncrementScore()
	{
		Score++; //this.Score does not have to be used as it is implied unless it is overloaded 
	}
}
