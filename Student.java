public class Student extends User {
    private String course;

    public Student(String userId, String name, String course) {
        super(userId, name);
        this.course = course;
    }

    @Override
    public void requestTransport() {
        System.out.println("Student " + name + " is requesting a shuttle to class.");
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
