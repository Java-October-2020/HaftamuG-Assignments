import java.util.ArrayList;
import java.util.Collections;

public class listofExceptions {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");

    for(int i = 0; i < myList.size(); i++) {
        try {
            Integer castedValue = (Integer) myList.get(i);
        } catch (ClassCastException e) {
            System.out.println("The errro message is: " + e.getMessage());
            System.out.println(myList.get(i));

            
        }
    }
    System.out.println(myList.indexOf("13"));
    System.out.println(myList.indexOf("hello world"));
    System.out.println(myList.indexOf("Goodbye World"));
    }
    
}
