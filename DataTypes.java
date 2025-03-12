public class DataTypes {
    // Instance Variables (Non-primitive types)
    String name = "Harshit Kumar";
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    // Static variables (Primitive types)
    static int id = 101;
    static boolean isActive = true;

    // Method to show all data types
    void displayDataTypes() {
        // Primitive data types
        byte b = 127; // Max value of byte
        short s = 32000;
        int i = 100000;
        long l = 10000000000L; // Must have 'L' at the end
        float f = 10.5f; // Must have 'f' at the end
        double d = 20.12345; // Double is more precise than float
        char c = 'J'; // Character type
        boolean flag = true; // Boolean can be true or false

        // Printing Primitive Data Types
        System.out.println("== Primitive Data Types ==");
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + flag);

        // Printing Non-Primitive Data Types
        System.out.println("\n== Non-Primitive Data Types ==");
        System.out.println("String value: " + name);

        System.out.println("Array Values: ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }
        System.out.println();

        // Static variable
        System.out.println("\nStatic int value: " + id);
        System.out.println("Static boolean value: " + isActive);
    }

    public static void main(String[] args) {
        // Creating an object to access instance variables and methods
        DataTypes obj = new DataTypes();

        obj.displayDataTypes();
    }
}
