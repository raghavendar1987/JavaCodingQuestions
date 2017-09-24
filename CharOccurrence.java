// How to find count of character of a given String?
import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {
    public static void main(String args[]) {
        String str1 = "abcdcdebcdafffdsdsfdwqeghnbvd";
    
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char str[] = str1.toCharArray();
        for(int i = 0;i<str.length; i++){
            int count = 1;
            for(int j=i+1;j<str.length; j++){
                if(str[i]==str[j]){
                    count = count+1;
                    str[j] = ' ';
                }
            }
            if(str[i] != ' '){
                map.put(str[i], count);   
            }
        }
         System.out.println("same character contains how many times?");
          for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println( entry.getKey() + ": contans " + entry.getValue() +" times" );
        }
    }
}
