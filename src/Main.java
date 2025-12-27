public class Main {
    public static void main(String[] args) {
        HospitalSystem myHospital = new HospitalSystem();

        // i am Adding Patients now
        myHospital.addPatientToSystem(101, "Fatma", 9, 30);
        myHospital.addPatientToSystem(102, "Huda", 4, 12);
        myHospital.addPatientToSystem(103, "Malik", 10, 20);
        myHospital.addPatientToSystem(104, "Mohamed", 4, 23);
        myHospital.addPatientToSystem(105,"A Rahman", 2, 15);
        myHospital.addPatientToSystem(107, "Rayan", 3,16);
        // 2. Sorting
        myHospital.sortBySeverity();
        myHospital.patients.printList();

        // 3. im adding Requests
        myHospital.makeRequest(102, false); // Huda is normal
        myHospital.makeRequest(103, true);  // Malik is emergency

        // 4. Process (Malik should go first because of his Priority)
        myHospital.processNext();
        myHospital.processNext();

        // 5. Checking  History
        myHospital.history.printStack();
    }
}