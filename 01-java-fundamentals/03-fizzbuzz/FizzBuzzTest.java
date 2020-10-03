public class FizzBuzzTest {
  public static void main(String[] args) {
    FizzBuzz fizbuzz = new FizzBuzz();
    int random = (int)(Math.random()*20 + 1);
    String result = fizbuzz.fizzBuzz(random);
    System.out.println(result);
    
    
  }
}