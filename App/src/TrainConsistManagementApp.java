package trainconsistmanagementapp;

import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        System.out.println("\n[UC19] Binary Search for Bogie ID");

        // 🔹 Sorted array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // (Optional safety) Ensure sorted
        Arrays.sort(bogieIds);

        // 🔹 Search key
        String searchKey = "BG309";

        System.out.println("\nSearching for Bogie ID: " + searchKey);

        // 🔹 Binary Search Logic
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                System.out.println("Bogie found at position: " + mid);
                break;
            } else if (comparison < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        // 🔹 Result
        if (!found) {
            System.out.println("Bogie not found in the train consist.");
        }

        System.out.println("\nProgram completed successfully.");
    }
}