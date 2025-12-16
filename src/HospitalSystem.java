import java.util.HashMap;

public class HospitalSystem {

    PatientList patientList;
    TreatmentQueue normalQueue;
    TreatmentQueue priorityQueue;
    DischargeStack dischargeStack;
    HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        patientList = new PatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }

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
        TreatmentRequest request;

        if(priorityQueue.size() > 0) {
            request = priorityQueue.dequeue();
        } else {
            request = normalQueue.dequeue();
        }
        if (request != null) {
            dischargeStack.push(new DischargeRecord(request.patientId));
        }
    }
    public void printSystemState() {
        System.out.println("Patients:");
        patientList.printList();

        System.out.println("\nNormal Queue;");
        normalQueue.printQueue();

        System.out.println("nPriority Queue:");
        priorityQueue.printQueue();

        System.out.println("\nDischarge Stack:");
        dischargeStack.printStack();
    }
}
