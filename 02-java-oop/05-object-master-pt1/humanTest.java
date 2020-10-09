public class humanTest {
    public static void main(String[] args) {
        Human wizard = new Human("wizard",  8, 3,3);
        Human samurai = new Human("samurai" ,6, 3, 3);
        wizard.attack(samurai);
    }
    
}
