public class HumanTest {
    public static void main(String[] args) {
        Wizard fighter1 = new Wizard();
        Samurai fighter2 = new Samurai();
        Ninja fighter3 = new Ninja();
        
        fighter1.fireball(fighter2);
        fighter1.heal(fighter3);

        fighter3.steal(fighter1);
        fighter3.runAway();

        fighter2.deathBlow(fighter1);
        fighter2.meditate();
        fighter2.howMany();
        System.out.println(" number of samurai is: " + fighter2.howMany());
    }
    
}
