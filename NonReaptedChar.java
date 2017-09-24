// How to find first non repeated character of a given String?
import java.util.HashMap;
import java.util.Map;

public class NonReaptedChar {
    public static void main(String args[]) {
        String str1 = "abcdcdebcdafffdsdsfdwqeghnbvd";
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
                if(count==1){
                    System.out.println("first non repeated char: "+ str[i]);
                break; 
                }
               
            }
        }
    }    
}
