import java.util.HashMap;

public class HospitalSystem {
    PatientList patientList = new PatientList();
    TreatmentQueue normalQueue = new TreatmentQueue();
    TreatmentQueue priorityQueue = new TreatmentQueue();
    DischargeStack dischargeStack = new DischargeStack();
    HashMap<Integer, Patient> patientMap = new HashMap<>();

    public void addPatient(Patient p) {
        patientList.addPatient(p);
        patientMap.put(p.id, p);
    }

    public void addTreatmentRequest(TreatmentRequest request) {
        if (request.priority) {
            priorityQueue.enqueue(request);
        } else {
            normalQueue.enqueue(request);
        }
    }

    public void processTreatment() {
        TreatmentRequest req = null;
        if (priorityQueue.size() > 0) {
            req = priorityQueue.dequeue();
        } else if (normalQueue.size() > 0) {
            req = normalQueue.dequeue();
        }

        if (req != null) {
            Patient p = patientMap.get(req.patientId);
            if (p != null) {
                System.out.println("SUCCESS: Now treating " + p.name + " (ID: " + p.id + ")");
                dischargeStack.push(new DischargeRecord(p.id));
            }
        } else {
            System.out.println("Wait: No patients in the queue.");
        }
    }

    public void printSystemState() {
        System.out.println("\n--- Final Summary ---");
        System.out.println("Total patients registered: " + patientMap.size());
        System.out.println("Remaining in Priority Queue: " + priorityQueue.size());
        System.out.println("Remaining in Normal Queue: " + normalQueue.size());
        System.out.println("Total Discharged: " + dischargeStack.size());
    }
}