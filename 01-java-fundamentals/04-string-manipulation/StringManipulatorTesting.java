

public class StringManipulatorTesting {
    public static void main(String[] args) {
        //trim a string
        StringManipulator manipulator = new StringManipulator();
         String str = manipulator.trimAndConcat("    Coding     ","     Dojo    ");
         System.out.println(str); 


        //occurence of characters in a string
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c);  
    

    // to find the first index of the substring
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        
       Integer index = manipulator.getIndexOrNull(word, subString);
       manipulator.getIndexOrNull(word, notSubString);
       System.out.println(index);

       //concatenate string and substring
        String words = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(words); 

   
    
  
}

}
