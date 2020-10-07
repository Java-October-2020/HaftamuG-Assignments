import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

public static ArrayList<Integer> sumofnumbersInTheArray(){
    int sum = 0;
int[] arr = {3,5,1,2,7,9,8,13,25,32};
ArrayList<Integer> newarray = new ArrayList<Integer>();
for(int i=0; i<arr.length; i++){
    sum = sum+arr[i];
    if(arr[i] >10){
    newarray.add(arr[i]);
    }
}
System.out.println(sum);
System.out.println(newarray);
    return newarray;
}

public static ArrayList<String> shuffleArrayValues(){
    
String[] Stringarr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
ArrayList<String> newStringArray = new ArrayList<String>();
ArrayList<String> shuffleArray = new ArrayList<String>();
for(int i=0; i<Stringarr.length; i++){
    shuffleArray.add(Stringarr[i]);
    Collections.shuffle(shuffleArray);
    
    if(Stringarr[i].length() > 5){
        newStringArray.add(Stringarr[i]);
    }
}
System.out.println(shuffleArray);
System.out.println(newStringArray);
    return newStringArray;
}

public static void alaphabetArray(){
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    ArrayList<Character> alphabetarray = new ArrayList<Character>();
    for(int i=0; i<alphabet.length; i++){
        alphabetarray.add(alphabet[i]);
        Collections.shuffle(alphabetarray);   
      
    }
    System.out.println(alphabetarray);
    System.out.println(alphabetarray.get(0));
    System.out.println(alphabetarray.get(25));
    if(alphabetarray.get(0).equals('a') || alphabetarray.get(0).equals('e') || alphabetarray.get(0).equals('i') || alphabetarray.get(0).equals('o') || alphabetarray.get(0).equals('u')){
        System.out.println("The First Character is a Vowel.");
    }
    }

    public static ArrayList<Integer> randomNumber(){
       ArrayList<Integer> newArray = new ArrayList<Integer>();
        
        for(int i=0; i<10; i++){
            Random intvalue = new Random();
            int num = intvalue.nextInt((100-55)+1) + 55;
            newArray.add(num);   
        }
        System.out.println(newArray );
        return newArray ;
    }

    public static ArrayList<Integer> sortRandom(){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
         
         for(int i=0; i<10; i++){
             Random intvalue = new Random();
             int num = intvalue.nextInt((100-55)+1) + 55;
             newArray.add(num); 
           
             
         }
         System.out.println(newArray );
         Collections.sort(newArray);
         System.out.println(newArray ); 
         System.out.println(newArray.get(0) );
         System.out.println(newArray.get(9) ); 
         return newArray ;
     }

    
    public static void main(String[] args) {
        sumofnumbersInTheArray();
        shuffleArrayValues();
        alaphabetArray();
        randomNumber();
        sortRandom();
        


    }
}
