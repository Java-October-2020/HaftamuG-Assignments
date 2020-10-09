public class BatTest {
    public static void main(String[] args) {
        
        Mammal mam = new Mammal(300, 3, 2, 2);
        mam.displayEnergy();
        Bat bat = new Bat();
        bat.fly();
        bat.displayEnergy();
        bat.eatHumans();
        bat.displayEnergy();
        bat.attackTown();
        bat.displayEnergy();
       
        
    }
}
