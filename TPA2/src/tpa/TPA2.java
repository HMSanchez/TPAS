//Harrisen Sanchez
//1/20/2017

package tpa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Random;

public class TPA2 {

	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat(".###");
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter a message: ");
		String message = read.readLine();
		Random random = new Random();
		int index = random.nextInt(message.length());
		message.charAt(index);
		char c = (message.charAt(index));
		System.out.println("The randomly selected character at position " + index + " is " + '\'' + c + '\'');
		System.out.println();

		System.out.print("Please enter a number: ");
		Double object1;
		double num1 = Double.parseDouble(read.readLine());
		object1 = num1;
		
		System.out.print("Please enter another number: ");
		Double object2;
		double num2 = Double.parseDouble(read.readLine());
		object2=num2;
		System.out.println(Math.pow(object1, object2));
		System.out.println(num1 + " raised to the power of  " + object2 + " is " + df.format((Math.pow(object1, object2))));

		System.out.println("The absolute value of " + df.format(Math.pow(object1, object2)) + " is "
				+ df.format(Math.abs((Math.pow(object1, object2)))));

	}

}
