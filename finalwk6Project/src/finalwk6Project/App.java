package finalwk6Project;

public class App {
	public static void main(String[] args)
    {
        Deck deck = new Deck();
        deck.shuffle();
    
        Player player1 = new Player("Eldjon");
        Player player2 = new Player("Jolene");
        
        for(int i = 0; i <26; i++)
        {
        	player1.Draw(deck);
        	player2.Draw(deck);
        
        }
        
        for (int i = 0; i < 26; i++)
        {
        	Card c1 = player1.Flip();
        	Card c2 = player2.Flip();
        	if(c1.getValue() > c2.getValue())
        		player1.IncrementScore();
        	
        	if(c2.getValue() > c1.getValue())
        		
        		player2.IncrementScore();
        	
        	
        }
   
    player1.Describe();
    player2.Describe();
    if (player1.Score > player2.Score)
    {
    	System.out.println("Player 1 has won the War");
    }
    else 
    {
    	System.out.println("Player 2 has won the War");
    }
 
    }
   
    

	
}
