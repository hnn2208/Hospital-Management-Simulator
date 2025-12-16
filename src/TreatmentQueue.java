public class TreatmentQueue {

    private class Node {
        TreatmentRequest data;
        Node next;

        Node(TreatmentRequest data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node front;
    private Node rear;
    private int size;

    public TreatmentQueue() {
        front = null;
        rear = null;
        size = 0;
    }
    public void enqueue(TreatmentRequest request) {
        Node newNode = new Node(request);

        if (rear == null) {
            front =  newNode;
            rear = newNode;
        } else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public TreatmentRequest dequeue() {
        front = front.next;

        if (front == null) {
            return null;
        }

        TreatmentRequest temp = front.data;

        if(front == null ) {
            rear = null;
        }

        size--;
        return temp;
    }

    public int size(){
        return size;
    }

    public void printQueue() {
        Node current = front; 

        while (current != null) {
            System.out.println(
                    "Patient ID: " + current.data.patientId + ", Priority: " + current.data.priority);
            current = current.next;
        }
    }
}
