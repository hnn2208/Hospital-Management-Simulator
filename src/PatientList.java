public class PatientList {



    // i'm adding here node class to store patient and link to next one
    private class Node {
        Patient data;
        Node next;

        Node(Patient data) {
            this.data = data;
            this.next = null;
        }
    }

    // the first node in the class
    private Node head;

    public void PatientList() {
        head = null;
    }
    //adding patient to the end of the list
    public void addPatient(Patient p) {
        Node newNode = new Node(p);

        // if the list is not full i mean empty
    if (head == null) {
        head = newNode;
    } else{
        Node current = head;
        while (current. next != null) {
            current = current.next;
        }
    }


    Node current = head;

    while (current.next != null) {
           current = current.next;
    }

        current.next = newNode;
}

    // removing the patient using id
    public void removePatient(int id) {
        if (head == null) {
            return;
        }

        // if the first patient is the one i want
        if (head.data.id == id) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.id == id) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    // if we wanna search paitent by id
    public Patient findPaitent(int id) {
        Node current = head;

        while (current != null) {
            if (current.data.id == id) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // when i want to print all patients in list
    public void printList() {
         Node current = head;

         while (current != null) {
              System.out.println(
                    "ID: " + current.data.id + ", Name: " + current.data.name + " Severity: " + current.data.severity + ",Age: " + current.data.age);


              current = current.next;
        }
    }
}