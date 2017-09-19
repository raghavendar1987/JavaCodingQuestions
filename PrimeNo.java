public class PrimeNo {
    public static void main(String args[]) {
      int n = 100;
	  System.out.println("Prime No from 1 to 100.");
      for(int i=1;i<=n;i++){
          for(int j =2; j<=i;j++){
              if(i == j){
                  System.out.print(" "+ i);
              }
              else if(i%j == 0){
                  break;
              }
          }
      }
    }
}
