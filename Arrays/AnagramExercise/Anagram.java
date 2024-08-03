import java.util.Arrays;

public class Anagram {

    public boolean areAnagrams(String str1, String str2) {
        
        if(str1==null || str2==null){  //check if null before converted the strings to lowercase
           return false;
       }
       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();
       
       char [] str1Arr = new char[str1.length()];
       char [] str2Arr = new char[str2.length()];
       
       //populate str1 array with characters from str1
       for(int i =0; i<str1.length(); i++){
           char ch = str1.charAt(i);
           str1Arr[i] = ch;
       }
       
      //populate str2 array with characters from str2
       for(int i =0; i<str2.length(); i++){
           char ch = str2.charAt(i);
           str2Arr[i] = ch;
       }
       
       //sort the characters to later check if the arrays are equal 
       Arrays.sort(str2Arr);
       Arrays.sort(str1Arr);
       
       if(Arrays.equals(str1Arr,str2Arr)){
           return true;
       }
      return false;
    }
}
