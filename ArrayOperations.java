public class ArrayOperations {
    public static void main(String[] args) {
        /*
         * Declation of Arrays
         * 
         * dataType[] arrayName; (recommended)
         * dataType arrayName[]; (not recommended)
         * 
         * Examples:
         * int[] numbers;
         * String[] names;
         * double[] prices;
         * chat[] letters;
         * 
         * Array are objects in java, so we need to allocate memory using new:
         * 
         * arrayName = new int[size];
         * 
         * ex.:
         * numbers = new int[5];
         * 
         * Declaration + Memory Allocation
         * int[] numbers = new int[5]; // Integer array with 5 elements
         * 
         * Initialization (Assigning Values)
         * int[] numbers = new int[5];
         * 
         * numbers[0] = 10;
         * numbers[1] = 20;
         * numbers[2] = 30;
         * numbers[3] = 40;
         * numbers[4] = 50;
         * 
         * Declaring & Initializing Together
         * int[] numbers = {10, 20, 30, 40, 50};
         */

        // Looping through array
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // for each loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
