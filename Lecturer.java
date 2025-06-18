public class Lecturer extends User {
    private String department;

    public Lecturer(String userId, String name, String department) {
        super(userId, name);
        this.department = department;
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + name + " is requesting transport for a meeting.");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
