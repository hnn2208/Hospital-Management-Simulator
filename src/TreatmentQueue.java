import java.util.LinkedList;

public class TreatmentQueue {
    private LinkedList<TreatmentRequest> list = new LinkedList<>();
    public void enqueue(TreatmentRequest r) { list.addLast(r); }
    public TreatmentRequest dequeue() { return list.pollFirst(); }
    public int size() { return list.size(); }
}