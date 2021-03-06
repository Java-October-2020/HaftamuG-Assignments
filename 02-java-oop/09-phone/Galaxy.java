
public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        String ring = getRingTone();
        return ring;
    }
    @Override
    public String unlock() {
        // your code here
        return "unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        // your code here     
        System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());       
    }
}