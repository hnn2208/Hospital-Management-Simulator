public class PatientList {


    // i'm adding here node class to store patient and link to next one
    private class Node {
        Patient patient;
        Node next;

        Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    // the first node in the class
    private Node head;

    //adding patient to the end of the list
    public void addPatient(Patient p) {
        Node newNode = new Node(p);

        // if the list is not full i mean empty
        if (head == null) {
            head = newNode;
            return;
        }


        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // removing the patient using id
    public boolean removePatient(int id) {
        if (head == null) {
            return false;
        }

        // if the first patient is the one i want
        if (head.patient.id == id) {
            head = head.next;
            return true;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.patient.id == id) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // if we wanna search paitent by id
    public Paitent findPaitentt(int id) {
        Node curent = head;

        while (current != null) {
            if (current.patient.id == id) {
                return current.patient;
            }
            current = current.next;
        }

        return null;
    }

    // when i want to print all patients in list
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.println(current.patient);
            current = current.next;
        }
    }
}