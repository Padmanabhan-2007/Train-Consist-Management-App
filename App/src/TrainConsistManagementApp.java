package trainconsistmanagementapp;

import java.util.*;

// 🔹 Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        // 🔹 Create bogie list (reuse from UC7/UC8/UC9)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70)); // extra

        System.out.println("\n[UC10] Bogie List:");
        System.out.println(bogies);

        // 🔹 Aggregation using Stream
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);    // sum all values

        // 🔹 Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nProgram completed successfully.");
    }
}