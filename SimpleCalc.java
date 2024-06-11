package CS401_Assignment1_RubenPlascencia;
import java.util.Scanner;
public class SimpleCalc {
	public static void main(String[] args) {
		boolean running = true;
		String loop = "";
		while (running) {
			Scanner input = new Scanner(System.in);
			
			int numb1;
			int numb2;
			int oper;
			int Result1 = 0;
			int Result2 = 0;
			int Result3 = 0;
			int Result4 = 0;
		
		
			System.out.print("Enter the first number:");
			numb1 = input.nextInt();
		
			System.out.print("Enter the second number:");
			numb2 = input.nextInt();
		
			System.out.print("Select an Operation: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n");
			System.out.print("Enter the operation number:");
			oper = input.nextInt();

			if (oper == 1) {
				Result1 = numb1 + numb2;
				System.out.printf("Result:" + numb1 + "+" + numb2 + "=" + Result1 + "\n");
			}	
			else if (oper == 2) {
				Result2 = numb1 - numb2; 	
				System.out.printf("Result:" + numb1 + "-" + numb2 + "=" + Result2 + "\n");
			}
			else if (oper == 3) {
				Result3 = numb1 * numb2;
				System.out.printf("Result:" + numb1 + "x" + numb2 + "=" + Result3 + "\n");
			}
			else if (oper == 4) {
				Result4 = numb1 / numb2;
				System.out.printf("Result:" + numb1 + "/" + numb2 + "=" + Result4 + "\n");
			}
			else if (oper < 1 || oper > 4) {
				System.out.printf("Invalid number, please select a valid option from the menu! \n");	
			}	
			System.out.print("Do you want to perform another calculation? (yes/no):");
			loop = input.next();
			if(loop.equals("no") || loop.equals("No")) {
				running = false;
				System.out.printf("Goodbye!");
			}
			else if (loop.equals("yes") || loop.equals("Yes")) {
				running = true;
				
			}
			else if (!loop.equals("yes") || !loop.equals("Yes")) {
				running = false;
				System.out.printf("Invalid input!");
			}
			else if (!loop.equals("no") || !loop.equals("No")) {
				running = false;
				System.out.printf("Invalid input!");
			}
		}	
	}
}
