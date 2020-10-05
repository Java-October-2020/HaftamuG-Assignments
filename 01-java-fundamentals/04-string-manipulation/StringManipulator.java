public class StringManipulator {
    public String trimAndConcat(String first, String second){
      
          String newString = first.trim() + second.trim();
           return newString;
    }

    public Integer getIndexOrNull(String name, char value){
        Integer count =0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == value) {
                count++;
            } 
        }
       return count;
  }

  public Integer getIndexOrNull(String name, String value){
      Integer index =  name.indexOf(value);
      if(value.equals(name.substring(2))){
        System.out.println(index);
        
      }else{
        System.out.println("null");
      }
      return index;
        
 }
   
 public String concatSubstring(String string1 , int index1, int index2, String string2){
     String substring = string1.substring(index1, index2);
     String concatstring = substring + string2;
     System.out.println(concatstring);

    return concatstring;
 }
}





