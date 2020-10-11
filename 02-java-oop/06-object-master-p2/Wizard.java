
public class Wizard extends Human{

    public Wizard(){
        super("Wizard", 3,3, 8, 50);
    }

    public void heal(Human target){
        target.health= target.health+this.intelligence;
        System.out.println(target.health);

    }


    public void fireball(Human target){
        target.health = target.health-(this.intelligence*3);
        System.out.println("Health for " + target.name + " is: " + this.health);

    }
}
