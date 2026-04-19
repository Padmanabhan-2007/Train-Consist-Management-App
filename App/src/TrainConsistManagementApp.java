package trainconsistmanagementapp;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        // Initialize list
        List<String> bogies = new ArrayList<>();

        System.out.println("\nTrain consist initialized.");
        System.out.println("Initial bogie count: " + bogies.size());

        // 🔹 Add passenger bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("\nAfter adding bogies:");
        System.out.println(bogies);

        // 🔹 Remove a bogie
        bogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(bogies);

        // 🔹 Check existence
        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(bogies);

        System.out.println("\nProgram continues...");
    }
}