package trainconsistmanagementapp;

// 🔹 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🔹 Passenger Bogie class with validation
class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        System.out.println("\n[UC14] Creating Passenger Bogies...");

        try {
            // 🔹 Valid bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 54);

            System.out.println("\nValid Bogies Created:");
            System.out.println(b1);
            System.out.println(b2);

            // 🔹 Invalid bogie (will throw exception)
            PassengerBogie b3 = new PassengerBogie("First Class", 0);

            System.out.println(b3); // won't execute

        } catch (InvalidCapacityException e) {
            System.out.println("\nException Occurred: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}