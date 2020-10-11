
public class Human {
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;
    protected String name;


    public Human(String name,int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
        this.name = name;
    }


    public void attack(Human human){
      int healthlose = this.health-this.strength;
        System.out.printf("%s attacks %s for %d strength\n Reduced health to: %d", this.name, human.name, this.strength, healthlose);

    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    

}