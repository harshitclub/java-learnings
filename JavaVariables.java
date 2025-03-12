public class JavaVariables {
    // Instance variable
    int a = 10;

    // Static variable
    static double pi = 3.14159;

    void show() {
        // Local variables
        boolean isTrue = true;
        System.out.println("Instance variable: " + a);
        System.out.println("Static variable: " + pi);
        System.out.println("Local Variable: " + isTrue);
    }

    public static void main(String[] args) {
        JavaVariables obj = new JavaVariables();
        obj.show();

        // Accessing static variable without object
        System.out.println("Accessing Static Variable Directly: " + JavaVariables.pi);
    }
}