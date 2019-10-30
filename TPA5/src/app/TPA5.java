//Harrisen Sanchez
//2/10/17
package app;

import java.io.IOException;

public class TPA5 {

	public static void main(String[] args) throws IOException {

		TPA5 myFarm = new TPA5();
		myFarm.run();
	}

	private void run() throws IOException {
		Bank n = new Bank();

		n.addAccount();

		n.displayAccount();
			}
	}

