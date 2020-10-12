
public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    String ring = getRingTone();
        return x;
    }
    @Override
    public String unlock() {
      
        return "unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
        // your code here   
        System.out.println("iphone " + getVersionNumber() + "from " + getCarrier());
        
    }
}