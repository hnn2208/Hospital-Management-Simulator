import java.util.ArrayList;

public class PatientList {
    ArrayList<Patient> list = new ArrayList<>();
    public void addPatient(Patient p) { list.add(p); }
    public void printList() {
        for(Patient p : list) {
            System.out.println("Registered: " + p.name);
        }
    }
}