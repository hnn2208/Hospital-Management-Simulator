public class Main {
    public static void main(String[] args) {
        System.out.println("--- Hospital Program Starting ---");

        HospitalSystem system = new HospitalSystem();

        // here will add patients
        system.addPatient(new Patient(1, "Fatma", 5, 20));
        system.addPatient(new Patient(2, "Huda", 8, 10));
        system.addPatient(new Patient(3, "Malik", 4, 30));
        system.addPatient(new Patient(4, "Rayan", 7, 22));
        system.addPatient(new Patient(5, "Hana", 2, 23));

        // here it will add requests
        system.addTreatmentRequest(new TreatmentRequest(1, false));
        system.addTreatmentRequest(new TreatmentRequest(2, false));
        system.addTreatmentRequest(new TreatmentRequest(3, true));  // Malik
        system.addTreatmentRequest(new TreatmentRequest(4, true));  // Rayan
        system.addTreatmentRequest(new TreatmentRequest(5, false));

        // we will the outputs in here!
        System.out.println("\n--- Processing Queue ---");
        system.processTreatment(); // Treats Malik first (Priority)
        system.processTreatment(); // Treats Rayan second (Priority)

        system.printSystemState();
        System.out.println("\n--- Program Finished ---");
    }
}