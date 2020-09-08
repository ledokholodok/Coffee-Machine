import java.util.Scanner;

public class CoffeeMachineAction{

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int water = 1200;
		int milk = 540;
		int beans = 120;
		int cups = 9;
		int money = 550;
		
		System.out.println("The coffee machine has:");
		System.out.println(water +  " of water");
		System.out.println(milk + " of milk");
		System.out.println(beans + " of coffee beans");
		System.out.println(cups + " of disposable cups");
		System.out.println(money + " of money");
		System.out.println("");
	
		System.out.println("Write action (buy, fill, take):");
		String action = scanner.nextLine();
		
		switch(action){
			case "buy":
				System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
				int type = scanner.nextInt();
				
				switch(type){
					case 1:
					System.out.println("");
						System.out.println("The coffee machine has:");
						System.out.println(water - 250 + " of water");
						System.out.println(milk + " of milk");
						System.out.println(beans - 16 + " of coffee beans");
						System.out.println(cups - 1 + " of disposable cups");
						System.out.println(money + 4 + " of money");
						break;
					case 2:
						System.out.println("");
						System.out.println("The coffee machine has:");
						System.out.println(water - 350 + " of water");
						System.out.println(milk - 75 + " of milk");
						System.out.println(beans - 20 + " of coffee beans");
						System.out.println(cups - 1 + " of disposable cups");
						System.out.println(money + 7 + " of money");
						break;
					case 3:
						System.out.println("");
						System.out.println("The coffee machine has:");
						System.out.println(water - 200 + " of water");
						System.out.println(milk - 100 + " of milk");
						System.out.println(beans - 12 + " of coffee beans");
						System.out.println(cups - 1 + " of disposable cups");
						System.out.println(money + 6 + " of money");
						break;
				}
				break;
			case "fill":
				System.out.println("Write how many ml of water do you want to add:");
				int fillWater = scanner.nextInt();
				System.out.println("Write how many ml of milk do you want to add:");
				int fillMilk = scanner.nextInt();
				System.out.println("Write how many grams of coffee beans do you want to add:");
				int fillBeans = scanner.nextInt();
				System.out.println("Write how many disposable cups of coffee do you want to add:");
				int fillCups = scanner.nextInt();
				
				System.out.println("");
				System.out.println("The coffee machine has:");
				System.out.println(water + fillWater + " of water");
				System.out.println(milk + fillMilk + " of milk");
				System.out.println(beans + fillBeans + " of coffee beans");
				System.out.println(cups + fillCups + " of disposable cups");
				System.out.println(money + " of money");
				break;
			case "take":
				System.out.println("I gave you " + money);
				System.out.println("");
				System.out.println("The coffee machine has:");
				System.out.println(water + " of water");
				System.out.println(milk + " of milk");
				System.out.println(beans + " of coffee beans");
				System.out.println(cups + " of disposable cups");
				System.out.println(money - money + " of money");
				break;		
		}
	}
}
