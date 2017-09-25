// an array 1-100 exactly one number is duplicate how do you find it?
import java.util.Random;
public class DupNum {
    public static void main(String args[]) {
      int ar[] = new int[100];
      Random ran = new Random();
      int n = ran.nextInt(99)+1;
      int duplicate = 0;
      System.out.println("Missing no would be: "+ n);
      int sum = 0;
      // storing 1-100 intiger in array ar.
      for(int i = 0;i<99; i++){
         if(i == n){
              ar[i] = i;
         } else{
              ar[i] = i+1;
         }
      }
      int tot_sum = 0;
      for(int i = 1;i<=99; i++){
          tot_sum += ar[i-1];
          sum +=  i;
          if(sum > tot_sum){
              duplicate = i-1;
              break;
          }
      }
      System.out.println("Duplicate no is:" + duplicate);
    }
}
