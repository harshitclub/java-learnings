/* 
 * Class:
 * - A class is a blueprint or template for creating objects.
 * - It defines the properties (fields/attributes) and  behaviors (methods) that object created from the class will have.
 * 
 * Object:
 * - An object is an instance of class.
 * - When we create an object, we are allocating memory for the attributes and behaviors defined in the class.
 * - Object holds the actual data and can perform actions using methods.
 */

class Car {
    // Attributes (fields)
    String brand;
    String color;
    int year;

    // Method (behavior)
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

class Dog {
    String name;
    int age;

    // Constructor
    Dog(String n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Classes {
    public static void main(String[] args) {

        // Create an object of Car class
        Car myCar = new Car();
        Dog myDog = new Dog("Shero", 12);

        // Assign values to attributes
        myCar.brand = "TATA";
        myCar.color = "Black";
        myCar.year = 2025;

        // call the method

        System.out.println("Car:--------");
        myCar.displayInfo();
        System.out.println("Dog:--------");
        myDog.displayInfo();

    }
}
