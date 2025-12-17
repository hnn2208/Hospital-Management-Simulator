
public class Main {


    public static void main(String[] args) {
        System.out.println("Program started");
        HospitalSystem system = new HospitalSystem();

        system.addPatient(new Patient(1, "Fatma",  5,20));
        system.addPatient(new Patient(2, "Huda", 8, 10));
        system.addPatient(new Patient(3, "Malik", 4, 30));

        system.addTreatmentRequest(new TreatmentRequest(1, false));
        system.addTreatmentRequest(new TreatmentRequest(2, false));
        system.addTreatmentRequest(new TreatmentRequest(3, true));
    }
}

