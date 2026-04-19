package trainconsistmanagementapp;

// 🔹 Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// 🔹 Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    // 🔹 Assign cargo with safety validation
    public void assignCargo(String cargo) {
        try {
            // Rule: Rectangular bogie cannot carry Petroleum
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be assigned to Rectangular bogie");
            }

            // If valid
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " → " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed for " + type + "\n");
        }
    }

    @Override
    public String toString() {
        return type + " (" + (cargo != null ? cargo : "No Cargo") + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App       ");
        System.out.println("======================================");

        System.out.println("\n[UC15] Cargo Assignment");

        // 🔹 Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // 🔹 Safe assignment
        b1.assignCargo("Petroleum");

        // 🔹 Unsafe assignment (will be caught)
        b2.assignCargo("Petroleum");

        // 🔹 Another valid assignment
        b2.assignCargo("Coal");

        // 🔹 Final state
        System.out.println("\nFinal Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nProgram continues safely...");
    }
}