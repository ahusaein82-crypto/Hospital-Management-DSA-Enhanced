package DataStructures;

public class Patient {
    private int id;
    private String name;
    private String dob;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private String diagnosis;
    private String treatmentStatus;
    private String status;

    public Patient(int id, String name, String dob, String gender, String phone, String email, String address, String diagnosis, String treatmentStatus, String status) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.diagnosis = diagnosis;
        this.treatmentStatus = treatmentStatus;
        this.status = status;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public String getTreatmentStatus() { return treatmentStatus; }
    public void setTreatmentStatus(String treatmentStatus) { this.treatmentStatus = treatmentStatus; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + "]";
    }
}
