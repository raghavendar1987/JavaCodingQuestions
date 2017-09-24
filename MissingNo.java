// How to find missing no between 1-100?
import java.util.Random;

public class MissingNo {
    public static void main(String args[]) {
      int ar[] = new int[100];
      Random ran = new Random();
      int n = ran.nextInt(100)+1;
      System.out.println("Missing no would be: "+ n);
      int sum = 0;
      for(int i = 1;i<=100; i++){
          if(i==n){
             continue; 
          }else{
              ar[i-1] = i;
          }
          sum +=  ar[i-1];
      }
      int tot_sum = 0;
      for(int i = 1;i<=100; i++){
          tot_sum += i;
      }
      System.out.println("Missing no is:" + (tot_sum-sum));
    }
}
