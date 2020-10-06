import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

public static void printsAllTheNumbers(){
    for(int i=1;i<=255;i++){
        System.out.println(i);
    }

}

public static void printsOddNumbers(){
    for(int i=1;i<=255;i++){
        if(i%2==1){
            System.out.println(i);
        }
        
    }

}
public static void printSumOfNumbers(){
    int sum =0;
    for(int i=0;i<=255;i++){
        sum=sum+i;
        System.out.println("New number: " + i + " Sum: " + sum);
    }
}

public static void iteratingArray(){
    int[] x ={1,3,5,7,9,13};
    for(int i=0;i<x.length;i++){
        System.out.println(x[i]);
    }
}

public static int findMax(){
    int[] x ={1,3,5,7,9,13};
    int max = x[0];
    for(int i=1;i<x.length;i++){
        if(max<x[i]){
            max = x[i];
        }
      
    }
    return max; 
}

public static double findAverage(){
    int[] x ={1,3,5,7,9,11};
    double sum = 0;
    double average;
    for(int i=0;i<x.length;i++){
     sum = sum+x[i];
      
    }
    average = sum/x.length;
    return average; 
}

public static ArrayList<Integer> oddNumbersInArray(){
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i=1;i<=255;i++){
      if(i%2==1){
          arr.add(i);   

      }
    }
    return arr;
}

public static int greaterThanY(int[] x, int number){
    int sum = 0;
    for(int i=0;i<x.length;i++){
      if(x[i] > number){
          sum++;
      }
    }
  return sum;
}

public static ArrayList<Integer> squareValues(int[] values){
    ArrayList<Integer> newArr = new ArrayList<Integer>();
    for(int i=0;i<values.length;i++){
        values[i]=values[i]*values[i];
      newArr.add(values[i]);
    }
  return newArr;
}

public static ArrayList<Integer> eliminateNegativeNumbers(int[] values){
    ArrayList<Integer> positiveArray = new ArrayList<Integer>();
    for(int i=0;i<values.length;i++){
        if(values[i] < 0){
            values[i]= 0;  
        }
        positiveArray.add(values[i]);
    }
  return positiveArray;
}

public static void maxMinAvg(int[] arramxminavg){
    ArrayList<Object> maxminvalue = new ArrayList<Object>();
    int sum = 0;
    double avg;
    int min = arramxminavg[0];
    int max = arramxminavg[0];

    for(int i=0;i<arramxminavg.length;i++){

       sum = sum+arramxminavg[i];
       if(max<arramxminavg[i]){
           max = arramxminavg[i];
           
       }
       if(min>arramxminavg[i]){
        min = arramxminavg[i];
        
       }
       
    }
    avg = (double)sum/(double)arramxminavg.length;
    maxminvalue.add(max);
    maxminvalue.add(min);
    maxminvalue.add(avg);
    System.out.println(maxminvalue);
}

public static int[] shiftingValuesInArray(int[] values){
    int[] shiftedarray = new int[values.length]; 
    for(int i=0; i<values.length-1; i++){
        if (i < values.length-1) { 
            shiftedarray[i] = values[i + 1];         
		} 
        if (i == values.length -1) { 
            shiftedarray[i] = values[0];       
         } 
    
        
    }
    
  return shiftedarray;
}

    public static void main(String[] args) {
        System.out.println("PRINTING NUMBERS BETWEEN 1  - 255");
        printsAllTheNumbers();
        System.out.println("PRINTING ODD NUMBERS BETWEEN 1  - 255");
        printsOddNumbers();
        System.out.println("PRINTING SUM OF NUMBERS BETWEEN 0  - 255");
        printSumOfNumbers();
        System.out.println("PRINTING NUMBERS IN ARRAY");
        iteratingArray();
        System.out.println("PRINTING MAXIMUM NUMBER IN ARRAY");
        int max = findMax();
        System.out.println(max);
        System.out.println("PRINTING AVERAGE OF THE NUMBERS IN ARRAY");
        double average = findAverage();
        System.out.println(average);
        System.out.println("PRINTING ODD NUMBERS IN ARRAY");
        ArrayList<Integer> x = oddNumbersInArray();
        System.out.println(x);
        System.out.println("PRINTING OCCURENCE OF GREATER NUMBERS");
        int[] z = {1,2,0,4,3,7,9};
        int occurrence = greaterThanY(z, 3);
        System.out.println(occurrence);

        System.out.println("PRINTING OCCURENCE OF GREATER NUMBERS");
        int[] arrayValues = {1,2,0,4,3,7,9};
        ArrayList<Integer> newArr = squareValues(arrayValues);
        System.out.println(newArr);

        System.out.println("ELIMINATING NEGATIVE NUMBERS");
        int[] intvalue = {1,-2,6,-4,3,-7,9};
        ArrayList<Integer> noNegative = eliminateNegativeNumbers(intvalue);
        System.out.println(noNegative);

        System.out.println("PRINTING MAXMINAVG");
        int[] arrvalue = {1,5,10,-2};
        maxMinAvg(arrvalue);

        System.out.println("PRINTING SHIFTED VALUES");
        int[] originalArray= {1,5,10,-2};
       System.out.println(Arrays.toString(shiftingValuesInArray(originalArray)));
    }
}
