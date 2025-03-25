import java.util.Scanner;

public class SimpleCalculator {
    static void add(int num1, int num2) {
        System.out.println("Addition Result: " + (num1 + num2));
    }

    static void subtract(int num1, int num2) {
        System.out.println("Subtraction Result: " + (num1 - num2));
    }

    static void multiply(int num1, int num2) {
        System.out.println("Multiplication Result: " + (num1 * num2));
    }

    static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed!");
        } else {
            System.out.println("Division Result: " + (num1 / num2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-:----- Select Your Choice -----:-");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter Your Choice (1 to 4): ");

        int choice = sc.nextInt();
        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter First Number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    subtract(num1, num2);
                    break;
                case 3:
                    multiply(num1, num2);
                    break;
                case 4:
                    divide(num1, num2);
                    break;
            }
        } else {
            System.out.println("Invalid choice! Please select a number between 1 and 4.");
        }
        sc.close();
    }
}
