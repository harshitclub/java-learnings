import java.util.Scanner;

public class BasicOperatons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input (name & age)
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        // Step 2: Perform basic arithmetic operations
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;

        // Step 3: Check if a number is even or odd
        System.out.println("Enter a number to check ever or odd: ");
        int checkNum = sc.nextInt();

        String evenOdd = (checkNum % 2 == 0) ? "Even" : "Odd";

        // Step 4: Calculate the area of rectangle
        System.out.println("Enter the length of rectangle: ");
        double length = sc.nextDouble();

        System.out.println("Enter the width of rectangle: ");
        double width = sc.nextDouble();

        double area = length * width;

        // Step 5: Find the largest of three numbers
        System.out.println("Enter the first number for comparison: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number for comparison: ");
        int b = sc.nextInt();

        System.out.println("Enter the third number for comparison: ");
        int c = sc.nextInt();

        int largest; // variable to store the largest number

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        // Step 6: Display Summary of User Input & Calculations
        System.out.println("\n===== Summary of Your Inputs & Calculations =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.println("\nArithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + diff);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);

        System.out.println("\nEven/Odd Check:");
        System.out.println(checkNum + " is " + evenOdd);

        System.out.println("\nRectangle Area Calculation:");
        System.out.println("Area of rectangle with length " + length + " and width " + width + " = " + area);

        System.out.println("\nLargest Number:");
        System.out.println("Largest among " + a + ", " + b + ", and " + c + " is: " + largest);

        sc.close();
    }
}