
public class Samurai extends Human {
     public static int numberofSamurai = 0;
    public Samurai(){
        super("Samurai", 3,3, 8, 200);
        numberofSamurai++;
    }
    

    public void deathBlow(Human target){
        this.health = this.health/2;
        System.out.println("After killing " + target.name + ", the " + this.name + " has left with " + this.health + " health");

    }

public void meditate(){
    this.health = this.health+(this.health/2);
    System.out.println("The current health for " + this.name + " is:" +  this.health);
}
    public int  howMany(){
    return numberofSamurai;
    }
}
