
public class Ninja extends Human{

    public Ninja() {
        super("Ninja", 0, 10, 5, 8);

    }
    
    public void steal(Human target){
     this.health = target.health-this.stealth;
     System.out.println("Ninja's health is:" + this.health);

    }
     
    public void runAway(){
        int healthNinja = this.health-10;
        System.out.println("After the Ninja run away his health reduced to:" + healthNinja);
        
    }
}
