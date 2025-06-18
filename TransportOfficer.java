public class TransportOfficer extends User {
    public TransportOfficer(String userId, String name, String email, String phone, String address) {
        super(userId, name, email, phone, address);
    }
  
    public void requestTransport() {
        System.out.println("Transport Officer " + getName() + " is managing transport schedules.");
    }

    @Override
    public void requestTransport(String destination) {
        throw new UnsupportedOperationException("Not supported yet."
                                                
    @Override
    public void requestTransport( String destination) {
        System.out.println("Transport Officer " + getName() + " is managing transport schedules."); main
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
