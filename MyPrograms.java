import java.util.Scanner; // For user input
import java.util.Random; // For generating random numbers
import java.util.Date; // For working with date and time

public class MyPrograms {

    // Function to perform arithmetic operations
    public static void arithmeticOperations(int a, int b) {
        System.out.println("\n=== Arithmetic Operations ===");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division not possible (denominator is zero)");
        }
    }

    // Function to check even or odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is Even.");
        else
            System.out.println(num + " is Odd.");
    }

    // Function to find the largest of three numbers
    public static int findLargest(int x, int y, int z) {
        return Math.max(x, Math.max(y, z)); // Using Math.max function
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Function to generate and print an array of random numbers
    public static void generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];

        System.out.println("\nRandom Array Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100); // Random number between 0-99
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        Random random = new Random(); // Random number generator
        Date currentDate = new Date(); // Date object

        // Display current date and time
        System.out.println("Current Date and Time: " + currentDate);

        // Taking user input
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine(); // Read full name

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("\nEnter two numbers for arithmetic operations: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Calling function for arithmetic operations
        arithmeticOperations(num1, num2);

        // Checking even or odd
        System.out.print("\nEnter a number to check even or odd: ");
        int checkNum = sc.nextInt();
        checkEvenOdd(checkNum);

        // Finding largest among three numbers
        System.out.print("\nEnter three numbers to find the largest: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Largest number is: " + findLargest(a, b, c));

        // Reversing a string
        System.out.print("\nEnter a string to reverse: ");
        sc.nextLine(); // Consume leftover newline
        String inputStr = sc.nextLine();
        System.out.println("Reversed String: " + reverseString(inputStr));

        // Generating an array of random numbers
        System.out.print("\nEnter the size of random array: ");
        int arrSize = sc.nextInt();
        generateRandomArray(arrSize);

        // Loop Example: Printing numbers using different loops
        System.out.println("\nLoop Examples:");

        System.out.println("For Loop - Counting 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nWhile Loop - Counting 1 to 5:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.println("\nDo-While Loop - Counting 1 to 5:");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

        // Switch Case Example: Day of the week
        System.out.print("\nEnter a number (1-7) for the day of the week: ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        // Closing scanner
        sc.close();
    }
}
