public class Van implements Serviceable {
    private String plateNumber;

    public Van(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void performService() {
        System.out.println("Van " + plateNumber + " is being serviced.");
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
