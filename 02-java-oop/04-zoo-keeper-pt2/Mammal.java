public class Mammal {

    protected int energyLevel;
    protected int attacking;
    protected int eating;
    protected int flying;
   
    
    public Mammal(int energyLevel, int attacking, int eating, int flying) {
        this.energyLevel = energyLevel;
        this.attacking = attacking;
        this.eating = eating;
        this.flying = flying;
    }
    

    public int getEnergyLevel() {
        return energyLevel;
    }

public int  displayEnergy(){
System.out.println("Then energy level is  :  " + this.energyLevel);
    return this.energyLevel;
}

public void setEnergyLevel(int energyLevel) {
    this.energyLevel = energyLevel;
}

public int getAttacking() {
    return attacking;
}

public void setAttacking(int attacking) {
    this.attacking = attacking;
}

public int getEating() {
    return eating;
}

public void setEating(int eating) {
    this.eating = eating;
}

public int getFlying() {
    return flying;
}

public void setFlying(int flying) {
    this.flying = flying;
}





  
}