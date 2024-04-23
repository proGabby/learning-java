
class Bicycle {
    // Properties
    protected int gear;
    protected int speed;
    protected int height; // Adding height property

    // Constructor
    public Bicycle(int gear, int speed, int height) {
        this.gear = gear;
        this.speed = speed;
        this.height = height; // Initializing height property
    }

    // Method to apply brakes
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    // Method to speed up
    public void speedUp(int increment) {
        speed += increment;
    }

    // Method to display bike information
    public void displayInfo() {
        System.out.println("Bicycle: Gear = " + gear + ", Speed = " + speed + ", Height = " + height);
    }
}

// Child class MountainBike
class MountainBike extends Bicycle {
    // Additional property
    private int suspension;

    // Constructor
    public MountainBike(int gear, int speed, int height, int suspension) {
        super(gear, speed, height);
        this.suspension = suspension;
    }

    public MountainBike(int gear, int speed, int height) {
        super(gear, speed, height);
        this.suspension = 10;
    }

    // Method to display mountain bike information
    public void displayInfo() {
        super.displayInfo();
        System.out.println("MountainBike: Suspension = " + suspension);
    }
}

// Child class SportBike
class SportBike extends Bicycle {
    // Additional property
    private String model;

    // Constructor
    public SportBike(int gear, int speed, int height, String model) {
        super(gear, speed, height);
        this.model = model;
    }

    public SportBike(int gear, int speed, int height) {
        super(gear, speed, height);
        this.model = "Yamaha R9";
    }

    // Method to display sport bike information
    public void displayInfo() {
        super.displayInfo();
        System.out.println("SportBike: Model = " + model);
    }
}

class Main {
    public static void main(String[] args) {
        // Create a SportBike object
        Bicycle sportBike = new Bicycle(5, 30, 100);

        // Display sport bike information
        sportBike.displayInfo();

        Bicycle bike = (Bicycle) sportBike;
        bike.displayInfo();

        MountainBike mountainBike = new MountainBike(sportBike.gear, sportBike.speed, sportBike.height);
        mountainBike.displayInfo();
    }
}