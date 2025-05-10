import java.util.Scanner;

public class Problem1_RotateRight {
	
	public static void rotateRightBy2Bits(int[] s) {
        int lastElement = s[s.length - 1];

        for (int i = s.length - 1; i > 0; i--) {
            s[i] = (s[i] >>> 2) | (s[i - 1] << (32 - 2));
        }

        s[0] = (s[0] >>> 2) | (lastElement << (32 - 2));
    }
	
	public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	
	public static void printBinaryArray(int[] arr) {
        for (int num : arr) {
            String binaryString = Integer.toBinaryString(num);
            String paddedBinaryString = String.format("%32s", binaryString).replace(' ', '0');
            System.out.println(paddedBinaryString);
        }
    }

	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] originalArray = new int[4];
        System.out.println("Enter 4 integer values for the original array:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            originalArray[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(originalArray);
        System.out.println("Original array showing 32 bit binary value:");
        printBinaryArray(originalArray);

        rotateRightBy2Bits(originalArray);

        System.out.println("After rotation array showing 32 bit binary value:");
        printBinaryArray(originalArray);
        System.out.println("After rotation array:");
        printArray(originalArray);

    }

}
