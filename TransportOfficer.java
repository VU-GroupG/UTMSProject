public class TransportOfficer extends User {
    public TransportOfficer(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + name + " is managing transport schedules.");
    }
}
