
public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("s9", 99, "verizon", "RING RING RING!");
        IPhone iphoneTen = new IPhone("x", 100, "AT&T", "ZING");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        iphoneTen.displayInfo();
        System.out.println(iphoneTen.ring());
        System.out.println(iphoneTen.unlock());

        
    }
    
}
