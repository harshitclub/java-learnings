import java.util.Scanner; // Import the Scanner class for user input

public class BeginnerProgram { // Declare the class name BeginnerProgram
    public static void main(String[] args) { // Main method, the starting point of the program
        // 1. Declare variables
        String userName; // Variable to store the user's name (text)
        int userAge; // Variable to store the user's age (whole number)
        double firstNumber; // Variable to store the first number entered by the user (decimal)
        double secondNumber; // Variable to store the second number entered by the user (decimal)
        double sum; // Variable to store the sum of the two numbers
        double difference; // Variable to store the difference of the two numbers
        double product; // Variable to store the product of the two numbers
        double quotient; // Variable to store the quotient of the two numbers
        int comparisonNumber; // Variable to store a number for comparison.
        String comparisonResult; // Variable to store the result of the comparison.

        // 2. Create a Scanner object
        Scanner input = new Scanner(System.in);

        // 3. Get User Input (Name and Age)
        System.out.println("Welcome! Please enter your name: "); // Print a message to the console
        userName = input.nextLine(); // Read the user's name from the console

        System.out.println("Enter your age: ");
        userAge = input.nextInt(); // Read the user's age from the console
        input.nextLine(); // Consume the newline character left by nextInt()

        // 4. Get User Input (Numbers for Calculations)
        System.out.println("Enter the first number: ");
        firstNumber = input.nextDouble(); // Read the first number from the console

        System.out.println("Enter the second number: ");
        secondNumber = input.nextDouble(); // Read the second number from the console

        // 5. Perform Calculations
        sum = firstNumber + secondNumber; // Calculate the sum
        difference = firstNumber - secondNumber; // Calculate the difference
        product = firstNumber * secondNumber; // Calculate the product
        quotient = firstNumber / secondNumber; // Calculate the quotient

        // 6. Display Calculation Results
        System.out.println("\n--- Calculation Results ---"); // Print a separator
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum); // Display the sum
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference); // Display the difference
        System.out.println(firstNumber + " * " + secondNumber + " = " + product); // Display the product
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient); // Display the quotient

        // 7. Get User Input for Comparison
        System.out.println("\n--- Comparison ---"); // Print a separator
        System.out.println("Enter a number to compare with 10: ");
        comparisonNumber = input.nextInt(); // Read the number from the console

        // 8. Perform Comparison Logic
        if (comparisonNumber > 10) { // Check if the number is greater than 10
            comparisonResult = "Greater than 10"; // Set the result
        } else if (comparisonNumber < 10) { // Check if the number is less than 10
            comparisonResult = "Less than 10"; // Set the result
        } else { // If neither greater nor less, it must be equal
            comparisonResult = "Equal to 10"; // Set the result
        }

        // 9. Display Comparison Result
        System.out.println(comparisonNumber + " is " + comparisonResult); // Display the comparison result

        // 10. Display User Information
        System.out.println("\n--- User Information ---"); // Print a separator
        System.out.println("User Name: " + userName); // Display the user's name
        System.out.println("User Age: " + userAge); // Display the user's age

        // 11. Close the Scanner
        input.close(); // Close the Scanner to release resources
    }
}
