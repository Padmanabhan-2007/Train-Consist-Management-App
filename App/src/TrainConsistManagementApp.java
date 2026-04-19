package trainconsistmanagementapp;

import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        System.out.println("\n[UC16] Bubble Sort on Bogie Capacities");

        // 🔹 Array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("\nOriginal Capacities:");
        System.out.println(Arrays.toString(capacities));

        // 🔹 Bubble Sort Algorithm
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // 🔹 Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // 🔹 Display sorted result
        System.out.println("\nSorted Capacities (Ascending):");
        System.out.println(Arrays.toString(capacities));

        System.out.println("\nProgram completed successfully.");
    }
}