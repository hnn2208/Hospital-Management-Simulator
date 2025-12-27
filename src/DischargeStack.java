import java.util.LinkedList;

public class DischargeStack {
    // I used a LinkedList to act as a Stack
    private LinkedList<DischargeRecord> my_stack = new LinkedList<>();

    //  also i write this  bc of adding a record to the top
    public void push(DischargeRecord record) {
        my_stack.addFirst(record);
    }

    //  this one will Remove the most recent record
    public DischargeRecord pop() {
        if (my_stack.isEmpty()) {
            return null;
        }
        return my_stack.removeFirst();
    }

    // this will Look at the top without removing
    public DischargeRecord peek() {
        return my_stack.peekFirst();
    }

    // Printing for the test scenario
    public void printStack() {
        System.out.println("--- Most Recent Discharges ---");
        for (DischargeRecord dr : my_stack) {
            System.out.println("Patient ID: " + dr.patientId + " | Time: " + dr.dischargeTime);
        }
    }
}
