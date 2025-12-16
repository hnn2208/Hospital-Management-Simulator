public class TreatmentRequest {

    int patientId;
    long arrivalTime;
    boolean priority;

    public TreatmentRequest(int patientId, boolean priority){
        this.patientId = patientId;
        this.priority = priority;
        this.arrivalTime = System.currentTimeMillis()
    }
}
