//Harrisen Sanchez
//2/17/2017
package app;

import java.util.Random;

public class Deck {

	private Card[] cards;
	private Random rand;
	
	public Deck(){
		cards = new Card[14];
	
        cards[0] = new Card("Move X 1", 1,Card.TYPE.MOVEX);    
        cards[1] = new Card("Move X 2", 2,Card.TYPE.MOVEX);
        cards[2] = new Card("Move X 3", 3,Card.TYPE.MOVEX);
        
        cards[3] = new Card("Move X -1 ", -1,Card.TYPE.MOVEX);
        cards[4] = new Card("Move X -2 ", -2,Card.TYPE.MOVEX);
        cards[5] = new Card("Move X -3 ", -3,Card.TYPE.MOVEX);
        
        
        cards[6] = new Card("Move Y 1", 1,Card.TYPE.MOVEY);
        cards[7] = new Card("Move Y 2", 2,Card.TYPE.MOVEY);
        cards[8] = new Card("Move Y 3", 3,Card.TYPE.MOVEY);

        cards[9] = new Card("Move Y -1 ", -1,Card.TYPE.MOVEY);
        cards[10] = new Card("Move Y -2", -2,Card.TYPE.MOVEY);
        cards[11] = new Card("Move Y -3", -3,Card.TYPE.MOVEY);
        
        cards[12] = new Card("Go to X 8" ,8, Card.TYPE.GOTOX);
        cards[13] = new Card("Go to Y 7" ,7, Card.TYPE.GOTOY);
        
        rand = new Random();		
	}

	public Card getCards() {
		int index = rand.nextInt(this.cards.length);
Card card =  cards[index];		
		return card;
	}
	
	public void DisplayAllCards(){
		for(Card a : cards){
			System.out.println(a);
		}
	}
	
}
