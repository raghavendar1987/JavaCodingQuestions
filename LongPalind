// Longest plaindrome
public class LongPalind {
    public static void main(String args[]) {
       String max ="a";
       String ar = "abaccddccefe";
       String cmp = " ";
       int len = ar.length();
       int r = 0, l = 0;
       boolean is_palin = false;
       for(int i = 0;i<len-1;i++){
           r = i;  l = i;
           cmp = " ";
          while(l>=0 && r<len && ar.charAt(l) == ar.charAt(r)){
              l = l-1;
              r = r+1;
          }
          cmp = ar.substring(l+1, r);
          if(max.length()<cmp.length()){
              max = cmp;
          }
       }
       System.out.println(max);
       
    }
}

// using method call
// Longest plaindrome
public class LongPalind {
    public static void main(String args[]) {
       String max ="a";
       String ar = "abaccdccefe";
       int len = ar.length();
       int r = 0, l = 0;
       boolean is_palin = false;
       for(int i = 0;i<len-1;i++){
         String cmp = getPalind(ar, i);
          if(max.length()<cmp.length()){
              max = cmp;
          } 
       } 
       System.out.println(max);
       
    }
    public static String getPalind(String ar, int cp){
         int r = cp,  l = cp;
          while(l>=0 && r<ar.length() && ar.charAt(l) == ar.charAt(r)){
              l = l-1;
              r = r+1;
          }
        return ar.substring(l+1, r);
    } 
}

