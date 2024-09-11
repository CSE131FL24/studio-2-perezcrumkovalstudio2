package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	

	Scanner in = new Scanner(System.in);
	System.out.println("Welcome to our casino, please enter your start amount: ");
	double startAmount = in.nextDouble();
	System.out.println("How many days have you played: ");
	int totalSimulations = in.nextInt();
	double winLimit = 20.0;
	double winChance = 0.60;
	double drew = Math.random();
	System.out.println(drew);
	
	for (int i = 0; i < totalSimulations; i++) {
		System.out.println(drew);
		
			while((startAmount < winLimit) && (startAmount > 0))
				System.out.println(Math.random());
					if (drew <= winChance) {
							System.out.println("Hooray success");
							startAmount++;
	}
					else {
						System.out.println("Whomp Whomp, you lose");
			startAmount--;
	
		}	
			System.out.println("Total amount: $" + startAmount);
		
		
		
	}

	
	
	

	
	
	}
}
