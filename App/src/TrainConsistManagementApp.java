package trainconsistmanagementapp;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        System.out.println("\n[UC20] Safe Search with Exception Handling");

        // 🔹 Empty bogie list (to trigger exception)
        String[] bogieIds = {};

        String searchKey = "BG309";

        try {
            // 🔹 Defensive check
            if (bogieIds.length == 0) {
                throw new IllegalStateException("Search cannot be performed: Train has no bogies.");
            }

            // 🔹 Linear Search (only runs if valid)
            boolean found = false;

            for (int i = 0; i < bogieIds.length; i++) {
                if (bogieIds[i].equals(searchKey)) {
                    found = true;
                    System.out.println("Bogie found at position: " + i);
                    break;
                }
            }

            if (!found) {
                System.out.println("Bogie not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}