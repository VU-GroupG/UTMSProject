public class Lecturer extends User {
    private String department;

    public Lecturer(String userId, String name, String department) {
        super(userId, name);
        this.department = department;
    }

    @Override
    public void requestTransport(String destination) {
        System.out.println("Lecturer " + getName() + " is requesting transport for a meeting.");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getUserType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean canAccessAdminFeatures() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
