import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What numbers would you like to calculate today? ");
		double x = scanner.nextDouble();
		System.out.println("What is the second number you would like to multiply the first with? ");
		double y = scanner.nextDouble();
		System.out.println("Your number is ");
		System.out.println(x * y);
		


	}

}
