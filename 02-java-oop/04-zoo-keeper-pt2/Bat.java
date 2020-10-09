public class Bat extends Mammal {
    

    public Bat(){
        super(300,3,2,2);
    }
    
    
    
    public void fly(){
        System.out.println("A bat taking off");
        int energylose= (this.flying *-50); 
        this.energyLevel = energyLevel+energylose;
      
        
    }
    
    public void eatHumans(){
        System.out.println("The Gorilla ate " + this.eating + " humans:");
        int gainEnergy =  (this.eating *25);
        this.energyLevel = energyLevel+gainEnergy;
       
        
    }
    
     public void attackTown(){
        System.out.println(this.attacking + " Towns are on fire " );
         int damage = (this.attacking *-100);
         this.energyLevel = energyLevel+damage;

        }
            
    }