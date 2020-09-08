import java.util.Scanner;

public class Cups{

	public static void main(String args[]){
		System.out.println("Write how many cups of coffee you will need:");
	
		Scanner scanner = new Scanner(System.in);
		int cups = scanner.nextInt();
		
		System.out.println("For 125 cups of coffee you will need:");
		System.out.println(cups * 200 + " ml of water");
		System.out.println(cups * 50 + " ml of milk");
		System.out.println(cups * 15 + " g of coffee beans");	
	}
}
