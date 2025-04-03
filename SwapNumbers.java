public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;

        System.out.println("Before Swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping logic
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
