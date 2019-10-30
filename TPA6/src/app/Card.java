//Harrisen Sanchez
//2/17/2017
package app;

public class Card {

	public static enum TYPE{ MOVEX, MOVEY, GOTOX, GOTOY}
	private String text;
	private int value;
	private TYPE action;
	
	
	public Card(String a, int b, TYPE c){
		this.action = c;
		this.value = b;
		this.text = a;
	}


	public int getValue() {
		return value;
	}


	public TYPE getAction() {
		return action;
	}
	
	
	  @Override
	    public String toString() {
	      
	        return  this.text ;
	    }
	
}
