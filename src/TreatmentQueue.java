import java.util.LinkedList;

public class TreatmentQueue {
    //i am Using a LinkedList to handle Queue operations
    private LinkedList<TreatmentRequest> list = new LinkedList<>();

    //  i made it for adding to the back of the line
    public void enqueue(TreatmentRequest request) {
        list.addLast(request);
    }

    // i made this for Remove from the front
    public TreatmentRequest dequeue() {
        if (list.isEmpty()) {
            return null;
        }
        return list.removeFirst(); // this is FIFO: First-In, First-Out
    }

    public int size() {
        return list.size();
    }

    // Printing the queue
    public void printQueue() {
        System.out.println("--- Waiting Queue ---");
        for (TreatmentRequest req : list) {
            System.out.println("Patient ID: " + req.patientId + " | Urgent: " + req.isUrgent);
        }
    }
}
