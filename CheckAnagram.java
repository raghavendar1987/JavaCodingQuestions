// Check whether two strings are anagram of each other
import java.util.Arrays;

public class CheckAnagram {
    public static void main(String args[]) {
        String str1 = new String("kunal");
        String str2 = new String("kulan");
        if(str1.length() != str2.length())
        {
            System.out.println("Not anagram !");
            return;
        }
        else{
            char ch1 [] = str1.toCharArray();
            char ch2 [] = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            String s1 = new String(ch1);
            String s2 = new String(ch2);
            
            if(s1.equals(s2)){
                System.out.println("Anagram String.");
            }
            else{
                System.out.println("Not anagram c!");   
            }
        }
    }
}
