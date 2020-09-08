import java.util.Scanner;

public class CoffeeMachineLoop {
	private static int water = 400;
	private static int milk = 540;
	private static int beans = 120;
	private static int cups = 9;
	private static int money = 550;
	private static State currentState = State.ACTION;

	private enum State {
		ACTION, COFFEE_VARIANT, ADD_WATER, ADD_MILK, ADD_BEANS, ADD_CUPS, EXIT;
	}

    public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Write action (buy, fill, take, remaining, exit):");

    	for (;;) {
    		if (currentState == State.EXIT) {
    			return;
    		}
			
    		String input = scanner.nextLine();
    		userInput(input);
		}
	}

	private static void userInput (String input) {
    	switch (currentState) {
    		case ACTION:
    			switch (input) {
					case "buy": 
						changeState(State.COFFEE_VARIANT);
						break;
					case "fill":
						changeState(State.ADD_WATER);
						break;
					case "take": 
						take();
						changeState(State.ACTION);
						break;
					case "remaining": 
						remaining();
						changeState(State.ACTION);
						break;
					case "exit":
						currentState = State.EXIT;
						break;
				}
				break;
			case COFFEE_VARIANT:
				switch (input) {
					case "1":
						buyEspresso();
						changeState(State.ACTION);
						break;
					case "2":
						buyLatte();
						changeState(State.ACTION);
						break;
					case "3":
						buyCappuccino();
						changeState(State.ACTION);
					case "back":
						System.out.println("");
					    changeState(State.ACTION);
						break; 
				}
				break;
			case ADD_WATER:
				int amountOfWater = Integer.parseInt(input);
				addWater(amountOfWater);
				changeState(State.ADD_MILK);
				break;
			case ADD_MILK:
				int amountOfMilk = Integer.parseInt(input);
				addMilk(amountOfMilk);
				changeState(State.ADD_BEANS);
				break; 
			case ADD_BEANS:
				int amountOfBeans = Integer.parseInt(input);
				addBeans(amountOfBeans);
				changeState(State.ADD_CUPS);
				break; 
			case ADD_CUPS:
				int amountOfCups = Integer.parseInt(input);
				addCups(amountOfCups);
				changeState(State.ACTION);
				break;  
    	}
	}

	private static void buyEspresso() {
		if (water > 249 && beans > 15 && cups > 0) {
			System.out.println("I have enough resources, making you a coffee!\n");
			water -= 250;
			beans -= 16;
			cups -= 1;
			money += 4;
		} else {
			if (water < 250) System.out.println("Sorry, not enough water!\n");
			else if (beans < 16) System.out.println("Sorry, not enough coffee beans!\n");
		}
	}

	private static void buyLatte() {
		if (water > 349 && milk > 74 && beans > 19 && cups > 0) {
			System.out.println("I have enough resources, making you a coffee!\n");
			water -= 350;
			milk -= 75;
			beans -= 20;
			cups -= 1;
			money += 7;
		} else {
			if (water < 350) System.out.println("Sorry, not enough water!\n");
			if (milk < 75) System.out.println("Sorry, not enough milk!\n");
			if (beans < 20) System.out.println("Sorry, not enough coffee beans!\n");
		}
	}

	private static void buyCappuccino() {
		if (water > 199 && milk > 99 && beans > 11 && cups > 0) {
			System.out.println("I have enough resources, making you a coffee!\n");
			water -= 200;
			milk -= 100;
			beans -= 12;
			cups -= 1;
			money += 6;	
		} else {
			if (water < 200) System.out.println("Sorry, not enough water!\n");
			if (milk < 100) System.out.println("Sorry, not enough milk!\n");
			if (beans < 12) System.out.println("Sorry, not enough coffee beans!\n");
		}
	}

	private static void remaining() {
		System.out.println("The coffee machine has:");
		System.out.println(water +  " of water");
		System.out.println(milk + " of milk");
		System.out.println(beans + " of coffee beans");
		System.out.println(cups + " of disposable cups");
		System.out.println(money + " of money");
		System.out.println("");
	}

	private static void addWater(int amountOfWater) {
		water += amountOfWater;
	}

	private static void addMilk(int amountOfMilk) {
		milk += amountOfMilk;
	}
	
	private static void addBeans(int amountOfBeans) {
		beans += amountOfBeans;
	}

	private static void addCups(int amountOfCups) {
		cups += amountOfCups;
		System.out.println("");
	}

	private static void take() {
		System.out.println("I gave you " + money);
		money = 0;
		System.out.println("");
	}

	private static void changeState(State state) {
		currentState = state;

		switch (currentState) {
			case ADD_WATER:
				System.out.println("Write how many ml of water do you want to add:");
				break;
			case COFFEE_VARIANT:
				System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
				break;
			case ACTION:
				System.out.println("Write action (buy, fill, take, remaining, exit):");
				break;
			case ADD_MILK:
				System.out.println("Write how many ml of milk do you want to add:");
				break;
			case ADD_BEANS:
				System.out.println("Write how many grams of coffee beans do you want to add:");
				break;
			case ADD_CUPS:
				System.out.println("Write how many disposable cups of coffee do you want to add:");
				break;
		}
	}
}