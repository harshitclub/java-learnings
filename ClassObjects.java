// Defining a Class
class MyCar {
    // Attributes (Instance Variables)
    String brand;
    int speed;

    // Method
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class VarClass {
    // Instance Variable
    int instanceVar = 10;

    // Static Variable
    static int staticVar = 20;

    void showDetails() {
        // Local Variable
        int localVar = 30;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }
}

class MyConst {
    /*
     * A constructor is a special method used to initialize an object.
     * Constructor has same name as class.
     * Constructor has no return type.
     * Automatically called when an object is created
     */

    MyConst() {
        System.out.println("Constructor is created");
    }
}

public class ClassObjects {

    public static void main(String[] args) {
        // Creating an object of Car
        MyCar myCar = new MyCar();

        // Assigning values to object properties
        myCar.brand = "Tesla";
        myCar.speed = 200;

        // Calling method
        myCar.showDetails();

        VarClass myObj = new VarClass();
        myObj.showDetails();

        MyConst myObj2 = new MyConst();
    }
}
