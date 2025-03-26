import java.util.Scanner;

public class LargestOfThree {

    static void findLargest(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater than other two.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater than other two.");
        } else {
            System.out.println(num3 + " is greater than other two.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        findLargest(num1, num2, num3);

        sc.close();
    }
}
