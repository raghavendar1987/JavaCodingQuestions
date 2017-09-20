
// Print all permutation of String both iterative way
import java.util.ArrayList;
public class PermuteString {
    public static void main(String args[]) {
        String str = "ABCD";
        PermuteString pr = new PermuteString();
        for(int i = 0; i<str.length();i++){
             pr.findPer(str, i);
        }
    }
    static void findPer(String str,int i){
        ArrayList<String> a1 = new ArrayList<String>();
        char ch [] = str.toCharArray();     
        char temp = ch[i];
        ch[i] = ch[0];
        ch[0] = temp;
        String st = new String(ch);
        for(int k = 1; k<ch.length;k++){
            for(int j = 1; j<ch.length-1;j++){
                char t = ch[j];
                ch[j] = ch[j+1];
                ch[j+1] = t;
                String b = new String(ch);
                a1.add(b);
            }
        }
      System.out.println(a1);
    }
}

// Print all permutation of String Recursive way
import java.util.ArrayList;
public class PermuteString {
    public static void main(String args[]) {
        String str = "ABCD";
        PermuteString pr = new PermuteString();
        pr.findPer(str, 0);
        
    }
    static void findPer(String str,int i){
        ArrayList<String> a1 = new ArrayList<String>();
        char ch [] = str.toCharArray();     
        char temp = ch[i];
        ch[i] = ch[0];
        ch[0] = temp;
        String st = new String(ch);
        for(int k = 1; k<ch.length;k++){
            for(int j = 1; j<ch.length-1;j++){
                char t = ch[j];
                ch[j] = ch[j+1];
                ch[j+1] = t;
                String b = new String(ch);
                a1.add(b);
            }
        }
      System.out.println(a1);
      i++;
      if(i<str.length()){
          findPer(str, i);
      }
    }
} 
