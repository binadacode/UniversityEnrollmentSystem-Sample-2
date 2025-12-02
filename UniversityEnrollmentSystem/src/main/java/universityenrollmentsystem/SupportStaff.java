package universityenrollmentsystem;

public class SupportStaff extends Person{
    private String role;
    private int shiftHours;
    private String staffID;

    public SupportStaff(String name, String surname, String role) {
        super(name, surname);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getShiftHours() {
        return shiftHours;
    }

    public void setShiftHours(int shiftHours) {
        this.shiftHours = shiftHours;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    @Override
    public String toString() {
        return "SupportStaff{" +
                "role='" + role + '\'' +
                ", shiftHours=" + shiftHours +
                ", staffID='" + staffID + '\'' +
                '}';
    }
}
