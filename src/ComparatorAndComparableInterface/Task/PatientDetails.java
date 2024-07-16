package ComparatorAndComparableInterface.Task;

public class PatientDetails {
    private int patientId;
    private String  name;
    private String doctorName;
    private String specialization;
    private int billNo;
    private double billAmount;

    public PatientDetails(int patientId, String name, String doctorName, String specialization, int billNo, double billAmount) {
        this.patientId = patientId;
        this.name = name;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.billNo = billNo;
        this.billAmount = billAmount;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getBillNo() {
        return billNo;
    }

    public double getBillAmount() {
        return billAmount;
    }

    @Override
    public String toString() {
        return "PatientDetails{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", billNo=" + billNo +
                ", billAmount=" + billAmount +
                '}';
    }
}
