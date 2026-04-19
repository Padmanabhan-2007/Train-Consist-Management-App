package trainconsistmanagementapp;

import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        // =========================
        // 🔹 UC1: Initialize Train
        // =========================
        List<String> bogies = new ArrayList<>();

        System.out.println("\n[UC1] Train consist initialized.");
        System.out.println("Initial bogie count: " + bogies.size());

        // =========================
        // 🔹 UC2: ArrayList Operations
        // =========================
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("\n[UC2] After adding bogies:");
        System.out.println(bogies);

        bogies.remove("AC Chair");

        System.out.println("After removing AC Chair:");
        System.out.println(bogies);

        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists.");
        }

        // =========================
        // 🔹 UC3: HashSet (Unique IDs)
        // =========================
        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate

        System.out.println("\n[UC3] Unique Bogie IDs:");
        System.out.println(bogieIds);

        // =========================
        // 🔹 UC4: LinkedList (Ordered)
        // =========================
        LinkedList<String> trainList = new LinkedList<>();

        trainList.add("Engine");
        trainList.add("Sleeper");
        trainList.add("AC");
        trainList.add("Cargo");
        trainList.add("Guard");

        System.out.println("\n[UC4] Initial Train:");
        System.out.println(trainList);

        trainList.add(2, "Pantry");

        System.out.println("After adding Pantry:");
        System.out.println(trainList);

        trainList.removeFirst();
        trainList.removeLast();

        System.out.println("After removing first & last:");
        System.out.println(trainList);

        // =========================
        // 🔹 UC5: LinkedHashSet (Order + Unique)
        // =========================
        LinkedHashSet<String> trainSet = new LinkedHashSet<>();

        trainSet.add("Engine");
        trainSet.add("Sleeper");
        trainSet.add("Cargo");
        trainSet.add("Guard");
        trainSet.add("Sleeper"); // duplicate

        System.out.println("\n[UC5] Final Train Formation:");
        System.out.println(trainSet);

        // =========================
        // 🔹 UC6: HashMap (Bogie → Capacity)
        // =========================
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        System.out.println("\n[UC6] Bogie Capacity Mapping:");

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram completed successfully.");
    }
}