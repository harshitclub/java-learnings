import java.util.Scanner;

public class SimpleCalculator {
    static void add(int num1, int num2) {
        System.out.println("Addintion Result: " + (num1 + num2));
    }

    static void subtract(int num1, int num2) {
        System.out.println("Subtration Result: " + (num1 - num2));
    }

    static void multiply(int num1, int num2) {
        System.out.println("Multiply Result: " + (num1 * num2));
    }

    static void divide(int num1, int num2) {
        System.out.println("Divide Result: " + (num1 / num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-:----- Select your choice -----:-");
        System.out.println("1. Addintion");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter Your Choice from 1 to 4: ");
        int choice = sc.nextInt();
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
        sc.close();
    }
}
