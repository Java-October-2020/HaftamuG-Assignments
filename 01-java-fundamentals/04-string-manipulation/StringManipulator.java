public class StringManipulator {
    public String trimAndConcat(String first, String second){
      
          String newString = first.trim() + second.trim();
           return newString;
    }

    public Integer getIndexOrNull(String name, char value){
       
            if (name.indexOf(value) !=-1) {
              return name.indexOf(value);
            }else{
              return null;
            }
   
  
  }

  public Integer getIndexOrNull(String name, String value){
      Integer index =  name.indexOf(value);
      if(value.equals(name.substring(2))){
        return index;
      }else{
        return null;
      }
 }
   
 public String concatSubstring(String string1 , int index1, int index2, String string2){
     String substring = string1.substring(index1, index2);
     String concatstring = substring + string2;

    return concatstring;
 }
}





