import java.util.Scanner;

public class AmountOfCoffee {

	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write how many ml of water the coffee machine has:");
		int water = scanner.nextInt();

		System.out.println("Write how many ml of milk the coffee machine has:");
		int milk = scanner.nextInt();

		System.out.println("Write how many grams of coffee beans the coffee machine has:");
		int beans = scanner.nextInt();
		
		System.out.println("Write how many cups of coffee you will need:");
		int cups = scanner.nextInt();
		
		int minCups = Math.min(Math.min(water / 200, milk / 50), beans / 15);
		
		if ((water / (200 * cups) == 1) && (milk / (50 * cups) == 1) && (beans / (15 * cups) == 1) && (water >= 200) && (milk >= 50) && (beans >= 15)) {
			System.out.println("Yes, I can make that amount of coffee");
		}
		else if ((water / (200 * cups) >= 1) && (milk / (50 * cups) >= 1) && (beans / (15 * cups) >= 1)) {
			System.out.println("Yes, I can make that amount of coffee (and even " + (minCups - cups) + " more than that)");
		}
		else{
			System.out.println("No, I can make only " + minCups + " cup(s) of coffee");
		}
	}
}
