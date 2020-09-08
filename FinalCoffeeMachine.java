import java.util.Scanner;

public class FinalCoffeeMachine {
	   	static int water = 1200;
		static int milk = 540;
		static int beans = 120;
		static int cups = 9;
		static int money = 550;

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	for (;;) {
    		System.out.println("Write action (buy, fill, take, remaining, exit):");
    		String action = scanner.nextLine();
			switch (action) {
				case "buy": 
					getBuy();
					break;
				case "fill":
					getFill();
					break;
				case "take": 
					getTake();
					break;
				case "remaining": 
					getRemaining();
					break;
				case "exit":
					return;
			}
		}
	}

	public static void getBuy() {
		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
				Scanner scanner = new Scanner(System.in);
				String type = scanner.nextLine();

				switch(type){
					case "1":
						if (water > 249 && beans > 15 && cups > 0) {
							System.out.println("I have enough resources, making you a coffee!\n");
							water -= 250;
							beans -= 16;
							cups -= 1;
							money += 4;
						}
						else {
							if (water < 250) System.out.println("Sorry, not enough water!\n");
							else if (beans < 16) System.out.println("Sorry, not enough coffee beans!\n");
						}
						break;

					case "2":
						if (water > 349 && milk > 74 && beans > 19 && cups > 0) {
							System.out.println("I have enough resources, making you a coffee!\n");
							water -= 350;
							milk -= 75;
							beans -= 20;
							cups -= 1;
							money += 7;
						}
						else {
							if (water < 350) System.out.println("Sorry, not enough water!\n");
							if (milk < 75) System.out.println("Sorry, not enough milk!\n");
							if (beans < 20) System.out.println("Sorry, not enough coffee beans!\n");
						}
						break;
						
					case "3":
						if (water > 199 && milk > 99 && beans > 11 && cups > 0) {
							System.out.println("I have enough resources, making you a coffee!\n");
							water -= 200;
							milk -= 100;
							beans -= 12;
							cups -= 1;
							money += 6;	
						}
						else {
							if (water < 200) System.out.println("Sorry, not enough water!\n");
							if (milk < 100) System.out.println("Sorry, not enough milk!\n");
							if (beans < 12) System.out.println("Sorry, not enough coffee beans!\n");
						}
						break;

					case "back":
						break;
				}
}

	public static void getRemaining() {
		System.out.println("The coffee machine has:");
		System.out.println(water +  " of water");
		System.out.println(milk + " of milk");
		System.out.println(beans + " of coffee beans");
		System.out.println(cups + " of disposable cups");
		System.out.println(money + " of money");
		System.out.println("");
	}

	public static void getFill() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Write how many ml of water do you want to add:");
		int fillWater = scanner1.nextInt();
		water += fillWater;
		System.out.println("Write how many ml of milk do you want to add:");
		int fillMilk = scanner1.nextInt();
		milk += fillMilk;
		System.out.println("Write how many grams of coffee beans do you want to add:");
		int fillBeans = scanner1.nextInt();
		beans += fillBeans;
		System.out.println("Write how many disposable cups of coffee do you want to add:");
		int fillCups = scanner1.nextInt();
		cups += fillCups;
		System.out.println("");
	}

	public static void getTake() {
		System.out.println("I gave you " + money);
		money -= money;
		System.out.println("");
	}

}
