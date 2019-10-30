//Harrisen Sanchez
//2/25/17
package app;

import java.io.IOException;

public class TPA7 {
	private Book[] books = new Book[10];

	public static void main(String[] args) throws IOException {
	TPA7 j = new TPA7();
	
	j.run(args);
j.displayBooks();
		
		
		
	    
	}
	private TPA7(){
		books = new Book[10];
	}
	
	private void run(String[] a){
		
		if(a.length != 0){
			for(int i = 0; i <a.length; i++){
				String[] b = a[i].split(":");
				
				books[i] = new Book(b[0],b[1]);
			}
		}else{
			System.out.println("No books entered");
		}
		


	}	
	private void displayBooks(){
//		int index =this.books.length;
//Book b =  books[index];		
//System.out.println(b);

for(Book a : books){
	if(a != null){
		System.out.println(a);
}
	}


}}
