

public class StringManipulatorTesting {
    public static void main(String[] args) {
        //trim a string
        StringManipulator manipulator = new StringManipulator();
         String str = manipulator.trimAndConcat("    Coding     ","     Dojo    ");
         System.out.println(str); 


        //occurence of characters in a string
        char letter = 'j';
        String value = "coding dojo";
        Integer a = manipulator.getIndexOrNull(value, letter);
            if(a==1){
                Integer occurrence = value.indexOf(letter);
                System.out.println(occurrence);
            }else if(a>1){
                Integer occurrence2 = value.indexOf(letter,0);
                System.out.println(occurrence2);
            }else{
                System.out.println("character not exist");
            } 
    
    // to find the first index of the substring
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
       manipulator.getIndexOrNull(word, subString);
       manipulator.getIndexOrNull(word, notSubString);

       //concatenate string and substring
     manipulator.concatSubstring("Hello", 2, 3, "World");

   
    
  
}

}
