import java.util.*;
public class RandomMean{
   public static void main(String[] args) {
     double arry [] = new double[100];
     for(int i = 0; i < 100; i++) {
       double randomNumbers = (double)Math.round(Math.random()*100);
       arry[i] = randomNumbers;

       System.out.println(Arrays.toString(randomNumbers));

   }
}
   //Average
  public static double avg(int[] arry) {
   double total = 0.0;
   for(int i=0; i<arry.length; i++) {
   total += arry[i];
}
   double average = total / arry.length;

   return average;
}
  public static int mode(int[] arr){
    int max = findMax(arr);

    int[] freq = new int [max + 1];

    for (int i = 0; i < arry.length; i++){
      freq[arr[i]]++;

    }
    Syetem.out.println(Arrays.toString(freq));
    return 0;

  }//end mode
  public statuc int findMax(int[] arr){
    int max = -99999;

    for(int i = 0; i < arry.length; i++){
      if(arr[i] > max{
        max = arr [i];
      }// end if
    }// end loop

    return max;
  }//end max

}// class
