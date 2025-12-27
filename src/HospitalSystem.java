import java.util.*;

public class HospitalSystem {
    PatientList patients = new PatientList();
    TreatmentQueue normalQ = new TreatmentQueue();
    TreatmentQueue urgentQ = new TreatmentQueue(); // this one is  Hybrid Queue
    DischargeStack history = new DischargeStack();
    HashMap<Integer, Patient> quickLookup = new HashMap<>();

    public void addPatientToSystem(int id, String name, int severity, int age) {
        Patient p = new Patient(id, name, severity, age);
        patients.addPatient(p);
        quickLookup.put(id, p);
    }

    public void makeRequest(int id, boolean urgent) {
        TreatmentRequest tr = new TreatmentRequest(id, urgent);
        if (urgent) urgentQ.enqueue(tr);
        else normalQ.enqueue(tr);
    }

    public void processNext() {
        TreatmentRequest tr = null;
        // this is Priority logic it always checks urgent first
        if (urgentQ.size() > 0) tr = urgentQ.dequeue();
        else if (normalQ.size() > 0) tr = normalQ.dequeue();

        if (tr != null) {
            System.out.println("Treating Patient ID: " + tr.patientId);
            history.push(new DischargeRecord(tr.patientId));
        }
    }

    //i  made this for Sorting by Severity (Bubble Sort)
    public void sortBySeverity() {
        LinkedList<Patient> list = patients.getAll();
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).severity < list.get(j + 1).severity) {
                    Patient temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}