import java.util.Scanner;

public class Problem2_ConvertToAnyBase {
	
	public static String convertToAnyBase(int n, int b) {
		if (n < 0 || b < 2 || b > 36) {
			throw new IllegalArgumentException(
					"Invalid input: n should be non-negative, and b should be between 2 and 36");
		}

		char[] digitsAndAlphabets = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

		if (n == 0) {
			return "0";
		}

		StringBuilder result = new StringBuilder();

		while (n > 0) {
			int remainder = n % b;
			result.insert(0, digitsAndAlphabets[remainder]);
			n /= b;
		}

		return result.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal integer: ");
		int decimalNumber = sc.nextInt();
		System.out.print("Enter the target base: ");
		int targetBase = sc.nextInt();

		if (targetBase < 2 || targetBase > 36) {
			System.out.println("Invalid target base. Please enter a value between 2 and 36.");
			return;
		}

		String result = convertToAnyBase(decimalNumber, targetBase);
		System.out.println("Decimal " + decimalNumber + " to base " + targetBase + ": " + result);

	}

	
}
