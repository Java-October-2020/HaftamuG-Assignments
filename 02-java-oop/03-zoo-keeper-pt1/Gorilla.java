
public class Gorilla extends Mammal {
    

public Gorilla(){
    super(100,3,2,1);
}



    public void throwingSomething(){
        System.out.println("The Gorilla Throwing bananas " + this.throwing + " times" );
        int damage = (this.throwing *-5);
        this.energyLevel = energyLevel+damage;
        
    }

    public void eatBananas(){
        System.out.println("The Gorilla ate banana:  " + this.eating + " times");
        int gainEnergy =  (this.eating *10);
        this.energyLevel = energyLevel+gainEnergy;
       

    }

    public void climb(){
        System.out.println("The Gorilla climbed  atree one time ");
         int energylose= (this.climbing *-10); 
         this.energyLevel = energyLevel+energylose;
        

    }
}
