import java.util.LinkedList;

public class PatientList {
    // this one is single Linked List to manage patients
    private LinkedList<Patient> hospital_list = new LinkedList<>();

    public void addPatient(Patient p) {
        hospital_list.add(p); // this will add for me a new Patient
    }

    public void removePatient(int id) {
        // this will find the patient and remove by their id
        for (int i = 0; i < hospital_list.size(); i++) {
            if (hospital_list.get(i).id == id) {
                hospital_list.remove(i);
                return;
            }
        }
    }

    public Patient findPatient(int id) {
        for (Patient p : hospital_list) {
            if (p.id == id) return p;
        }
        return null;
    }

    public void printList() {
        System.out.println("--- Current Patient List ---");
        for (Patient p : hospital_list) {
            System.out.println("ID: " + p.id + " | Name: " + p.name + " | Sev: " + p.severity);
        }
    }

    //i  need this to sort for task 4
    public LinkedList<Patient> getAll() {
        return hospital_list;
    }
}