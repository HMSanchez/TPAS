//Harrisen Sanchez
//1/27/17
package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;


public class TPA3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		 
		boolean valid =false;
		

		do{
System.out.println("Main Menu");
System.out.println("1). Calculate the hypotenuse of a right triangle.");
System.out.println("2). Reverse a message");
System.out.println("3). Play High/Low");
System.out.println("4). Exit");
System.out.print("Make a selection: ");
String options = read.readLine();
int opt = Integer.parseInt(options);
if(opt >4 || opt<0){
	System.out.println("Invalid");
	valid = false;
}
switch (opt) {
case 1:
	System.out.print("Enter side A: ");
	double a= Integer.parseInt(read.readLine());
	System.out.print("Enter side B: ");
	double b = Integer.parseInt(read.readLine());
	double py = (double) ((double) Math.pow(a,2) + Math.pow(b,2));
	double ty= (double) Math.sqrt(py);
	System.out.println("The hypotenuse is: " + ty + "");
	valid=false;
		break;
case 2:
	System.out.println("Enter a message: ");
	String x = read.readLine();
	String y = "";

	for(int i = x.length()-1; i >= 0; i--){
	y=y + x.charAt(i);
	}
	System.out.println(y);
	
	valid=false;
	break;
case 3:
	boolean isValid=false;
	Random rand = new Random();
	System.out.print("Enter the Low and High numbers seperated by a space: ");
	StringTokenizer st = new StringTokenizer(read.readLine());
	int low = Integer.parseInt(st.nextToken());
	int high= Integer.parseInt(st.nextToken());

int num = rand.nextInt(high)+low;
while(!isValid){
System.out.print("Guess a number: ");
int guess = Integer.parseInt(read.readLine());
if(guess <num){
	System.out.println("Too low.");
	isValid=false;
}else if(guess >num){
	System.out.println("Too high");
	isValid=false;;
}else{
	System.out.println("Right!");
	isValid=true;
}
	
}
	valid=false;
	
	break;
case 4:
	System.out.println("Quitting. Thanks for your service");
	valid =true;
	
}
		}while(!valid);
		
		

		

	}

}
