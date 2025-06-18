public class Main {
    public static void main(String[] args) {
        // Users
        User student = new Student("S001", "Alice", "Computer Science");
        User lecturer = new Lecturer("L002", "Dr. Bob", "Mathematics");
        User officer = new TransportOfficer("T003", "Charles");

        // Request transport (demonstrating polymorphism)
        student.requestTransport(null);
        lecturer.requestTransport(null);
        officer.requestTransport(null);

        // Vehicles
        Bus bus = new Bus("BUS123");
        Van van = new Van("VAN456");

        // Interface methods
        bus.performService();
        bus.trackLocation();
        bus.scheduleRoute("Campus Loop");

        van.performService();

        // Transport service - method overloading
        TransportService service = new TransportService();
        service.assignDriver("Bus");
        service.assignDriver("Van", "Morning Shift");
    }
}
