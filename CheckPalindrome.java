// Palindrome No using reverse method
//http://javarevisited.blogspot.in/2011/06/top-programming-interview-questions.html
//https://www.jdoodle.com/online-java-compiler
public class CheckPalindrome {
    public static void main(String args[]) {
        System.out.println("Code to check a String is palindrome or not");
        String str1 = "malayalam";
        String reverse = new StringBuffer(str1).reverse().toString();
        if(str1.equals(reverse)){
            System.out.println("It's palindrome");
        }
        
    }
}

// Palindrome No generic solution
public class CheckPalindrome {
    public static void main(String args[]) {
       String str1 = "noon";
       String sArray = new String["noon", "redivider", "civic", "radar", "level", "rotor", "kayak"];
       int len = str1.length();
       Boolean c = false;
     //   String str2 = new String[len];
      for(int j=0;j<sArray.length;j++){
           for(int i=0;i<(len/2);i++){
               if(str1.charAt(i) == str1.charAt(len-i-1))
               {
                   c = true;
               }
               else{
                    c = false;
                   System.out.println(sArray[j]+ "No palindrome.");
                   break;
               }
           }
           if(c){
                System.out.println(sArray[j]+ "palindrome.");
           }
        }
    }
}
