public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean isUrgent;

    public TreatmentRequest(int patientId, boolean isUrgent) {
        this.patientId = patientId;
        this.isUrgent = isUrgent;
        this.arrivalTime = System.currentTimeMillis();
    }
}