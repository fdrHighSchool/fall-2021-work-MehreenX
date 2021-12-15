import java.util.*;
public class RandomMean{
  public static void main(String[] args) {
     double arr [] = new double[100];
     for(int i = 0; i < 100; i++) {
       double randomNumbers = (double)Math.round(Math.random()*100);
       arr[i] = randomNumbers;
       // System.out.println(Arrays.toString(randomNumbers));
     }

     int[] testArr = {9, 11, 8, 12, 7, 13, 5, 15, 12, 8};

     System.out.println(mode(testArr));
   }

   //Average
  public static double avg(int[] arr) {
   double total = 0.0;
   for(int i=0; i<arr.length; i++) {
     total += arr[i];
   }
   double average = total / arr.length;

   return average;
  }

  public static String mode(int[] arr){
    int max = findMax(arr);

    int[] freq = new int [max + 1];
    System.out.println(Arrays.toString(freq));

    for (int i = 0; i < arr.length; i++){
      freq[arr[i]]++;

    }
    System.out.println(Arrays.toString(freq));

    int maxRep = findMax(freq);

    if(maxRep == 1){
      return "no mode";
    }

    else{
      for(int i = 0; i < freq.length; i++){
        if(freq[i] == maxRep){
          return "" + i;
        }
      }
    }
    return "";
  }//end mode

  public static int findMax(int[] arr){
    int max = -99999;

    for(int i = 0; i < arr.length; i++){
      if(arr[i] > max) {
        max = arr [i];
      }// end if
    }// end loop

    return max;
  }//end max

}// class
