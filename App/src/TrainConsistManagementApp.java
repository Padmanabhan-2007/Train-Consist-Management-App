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
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        // 🔹 Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\n[UC7] Before Sorting:");
        System.out.println(bogies);

        // 🔹 Sort using Comparator (ascending capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nSorted Bogies by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram completed successfully.");
    }
}