public class Bus implements Serviceable, Trackable, Schedulable {
    private String plateNumber;

    public Bus(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void performService() {
        System.out.println("Bus " + plateNumber + " is being serviced.");
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking location of Bus " + plateNumber);
    }

    @Override
    public void scheduleRoute(String route) {
        System.out.println("Bus " + plateNumber + " scheduled on route: " + route);
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
