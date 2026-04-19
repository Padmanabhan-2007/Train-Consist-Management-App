package trainconsistmanagementapp;

import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        System.out.println("\n[UC17] Sorting Bogie Names using Arrays.sort()");

        // 🔹 Array of bogie type names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // 🔹 Display original array
        System.out.println("\nOriginal Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // 🔹 Sort using built-in method
        Arrays.sort(bogieNames);

        // 🔹 Display sorted result
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nProgram completed successfully.");
    }
}