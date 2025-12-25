public class TreatmentRequest {
    int patientId;
    boolean priority;

    public TreatmentRequest(int patientId, boolean priority) {
        this.patientId = patientId;
        this.priority = priority;
    }
}