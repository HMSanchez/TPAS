//Harrisen Sanchez
//2/25/17
package app;

public class Book {

	private String title;
	private String author;
	
	
	public Book(String a, String b){
		this.title = a;
		this.author = b;
	}
	
	
	
	@Override	
	public String toString(){
		return  "Book: " + this.title + " by " + this.author;
		
	}
	
	
}
