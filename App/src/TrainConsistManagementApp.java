package trainconsistmanagementapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        // 🔹 Sample Inputs (you can change for testing)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("\n[UC11] Input Validation");
        System.out.println("Train ID: " + trainId);
        System.out.println("Cargo Code: " + cargoCode);

        // 🔹 Define Regex Patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // 🔹 Compile patterns
        Pattern trainIdPattern = Pattern.compile(trainPattern);
        Pattern cargoCodePattern = Pattern.compile(cargoPattern);

        // 🔹 Create matchers
        Matcher trainMatcher = trainIdPattern.matcher(trainId);
        Matcher cargoMatcher = cargoCodePattern.matcher(cargoCode);

        // 🔹 Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("\nTrain ID is VALID");
        } else {
            System.out.println("\nTrain ID is INVALID");
        }

        // 🔹 Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        System.out.println("\nProgram completed successfully.");
    }
}