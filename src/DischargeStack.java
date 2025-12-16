public class DischargeStack {
    private class Node {
        DischargeRecord data;
        Node next;
        Node(DischargeRecord data) {
            this.data = data;
        }
    }
    private Node top;

    public void push(DischargeRecord record){
      Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
    }

    public DischargeRecord pop () {
        if (top == null) {
            return null;
        }

        DischargeRecord temp = top.data;
        top = top.next;
        return temp;
    }
    public DischargeRecord peek(){
        if (top == null) {
            return null;
        }
        return top.data;
    }
    public Void printStack() {
        Node current = top;
        while (current != null) {
            System.out.println(
                    "Patient ID: " + current.data.patientId
            );
            current = current.next;
        }
        return null;
    }
}
