import java.util.Stack;

public class DischargeStack {
    private Stack<DischargeRecord> stack = new Stack<>();
    public void push(DischargeRecord r) { stack.push(r); }
    public int size() { return stack.size(); }
}