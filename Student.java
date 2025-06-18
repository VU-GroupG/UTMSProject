public class Student extends User {
    private String course;

    public Student(String userId, String name, String course) {
        super(userId, name);
        this.course = course;
    }

    public void requestTransport() {
        System.out.println("Student " + name + " is requesting a shuttle to class.");
    }

    // Implement the abstract method from User
    @Override
    public void requestTransport(String destination) {
        System.out.println("Student " + name + " is requesting a shuttle to " + destination + ".");
    }

    // Implement the abstract method from User
    @Override
    public boolean canAccessAdminFeatures() {
        return false;
    }

    // Implement the abstract method from User
    @Override
    public String getUserType() {
        return "Student";
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
