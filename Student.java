public class Student extends User {
    private String course;

    public Student(String userId, String name, String course) {
        super(userId, name);
        this.course = course;
    }

    @Override
    public void requestTransport(String destination) {
        System.out.println("Student " + getName() + " is requesting a shuttle to class.");
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
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
