public class TransportService {

    public void assignDriver(String vehicleType) {
        System.out.println("Assigning driver to vehicle type: " + vehicleType);
    }

    public void assignDriver(String vehicleType, String shiftTime) {
        System.out.println("Assigning driver to " + vehicleType + " for shift: " + shiftTime);
    }
}
