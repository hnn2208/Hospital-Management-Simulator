public class DischargeRecord {
    // i made this basic data for the record
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        // i made this because it captures the exact moment they leave
        this.dischargeTime = System.currentTimeMillis();
    }
}