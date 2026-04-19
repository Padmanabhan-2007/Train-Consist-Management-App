package trainconsistmanagementapp;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        System.out.println("\n[UC18] Linear Search for Bogie ID");

        // 🔹 Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 🔹 Search key
        String searchKey = "BG309";

        System.out.println("\nSearching for Bogie ID: " + searchKey);

        boolean found = false;

        // 🔹 Linear Search Logic
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie found at position: " + i);
                break; // stop once found
            }
        }

        // 🔹 Result
        if (!found) {
            System.out.println("Bogie not found in the train consist.");
        }

        System.out.println("\nProgram completed successfully.");
    }
}