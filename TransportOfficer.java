public class TransportOfficer extends User {
    public TransportOfficer(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void requestTransport( String destination) {
        System.out.println("Transport Officer " + getName() + " is managing transport schedules.");
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
