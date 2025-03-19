public class Loops {
    public static void main(String[] args) {
        // for loop method execution
        foorLoop();

        // while loop method execution
        whileLoop();

        // do while loop method execution
        doWhileLoop();
    }

    // for loop method
    public static void foorLoop() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Hello Harshit " + i);
        }
    }

    // while loop method
    public static void whileLoop() {
        int i = 1;
        while (i <= 10) {
            System.out.println("This is while loop " + i);
            i++;
        }
    }

    // do while loop method
    public static void doWhileLoop() {
        int i = 1;
        do {
            System.out.println("This is do while loop " + i);
            i++;
        } while (i <= 10);
    }
}
