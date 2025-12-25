public class DischargeRecord {
    int patientId;
    long dischargeTimestamp;

    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        // This records the exact time they were discharged
        this.dischargeTimestamp = System.currentTimeMillis();
    }
}