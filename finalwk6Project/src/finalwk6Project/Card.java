package finalwk6Project;

	public class Card {
	public String[] SuitNames = {"Spade", "Club", "Diamond", "Heart"};
	public String[] CardNames = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
		
	private int value;
	private int suit;

	// constructor 
	public Card(int value, int suit) 
	{
		this.suit = suit;
		this.value = value;
		
	}
	
	public String GetSuit()
	{
		return SuitNames[suit];
	}
	
	public String getName()
	{
		return CardNames[value - 2] + " of " + SuitNames[suit]; 
	
	}
	public void Describe() 
	{
		System.out.println(getName());
		
	}
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}
}
