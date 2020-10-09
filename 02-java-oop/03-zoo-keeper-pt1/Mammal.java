public class Mammal {

    protected int energyLevel;
    protected int throwing;
    protected int eating;
    protected int climbing;
   
    
    public Mammal(int energyLevel, int throwing, int eating, int climbing) {
        this.energyLevel = energyLevel;
        this.throwing = throwing;
        this.eating = eating;
        this.climbing = climbing;
    }
    

    public int getEnergyLevel() {
        return energyLevel;
    }

public int  displayEnergy(){
System.out.println("Then energy level is  :  " + this.energyLevel);
    return this.energyLevel;
}

public int getThowing() {
    return throwing;
}

public void setThowing(int thowing) {
    this.throwing = thowing;
}

public int getEating() {
    return eating;
}

public void setEating(int eating) {
    this.eating = eating;
}

public int getClimbing() {
    return climbing;
}

public void setClimbing(int climbing) {
    this.climbing = climbing;
}



  
}
