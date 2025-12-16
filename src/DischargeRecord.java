public class DischargeRecord {

    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId){
        this.patientId;
        this.dischargeTime = System.currentTimeMillis();
    }

    override
    public String toString() {
        return "Discharge{patientId=" + patientId + ", time=" + dischargeTime +'}';
    }
}
