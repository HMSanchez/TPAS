//Harrisen Sanchez
//2/17/2017
package app;

public class TPA6 {

	public static void main(String[] args) {

		//System.out.println("the" + args[0] + "are great");
		//System.out.println("the" + args[1] + "are great");
		
		String x = args[0];
		int a = Integer.parseInt(x);
//		if(args[0] ==null){
//			System.out.println("Usage: java -jar TPA6.jar [X length] [Y length]");
//			
//		}
		String y = args[1];
		int b = Integer.parseInt(y);
		
//		if(x == null || y == null){
//		String z = args[3] ;
//		z = "Usage: java -jar TPA6.jar [X length] [Y length]";
//		System.out.println(z);
//		}
//int a = 10;
//int b = 10;
		
		int pos1= 0;
		int pos2 = 0;
	Deck j = new Deck();
	System.out.println("Cards");
	j.DisplayAllCards();
		System.out.println();
		do{
		Card card = j.getCards();
		System.out.println(card);
		if(card.getAction() == Card.TYPE.MOVEX){
				pos1+= card.getValue();
			if(pos1 < 0){
				pos1 = 0;
			}
			if(pos1 > a){
				pos1 -= card.getValue(); 
			}
			System.out.println("Position: " + pos1 + " , " +  pos2);
		}else if(card.getAction() == Card.TYPE.MOVEY){
				
				pos2+= card.getValue();
			if(pos2 < 0){
				pos2 =0;
			}
			if(pos2 > a){
				pos2 -= card.getValue(); 
			}
			System.out.println("Position: " + pos1 + " , " +  pos2);
		}else if(card.getAction() == Card.TYPE.GOTOX){
			pos1 = card.getValue();
			System.out.println("Position: " + pos1 + " , " +  pos2);
		}else if(card.getAction() == Card.TYPE.GOTOY){
			pos2 = card.getValue();
			System.out.println("Position: " + pos1 + " , " +  pos2);
		}
		
		
		
			
			
			
		}while(a != pos1 || b != pos2);

	}
	
}
