import java.util.*;
public class CentralMeasures {
  public static void main(String[] args) {
     double arr [] = new double[100];
     for(int i = 0; i < 100; i++) {
       double randomNumbers = (double)Math.round(Math.random()*100);
       arr[i] = randomNumbers;
       // System.out.println(Arrays.toString(randomNumbers));
     }

     int[] testArr = {9, 11, 8, 12, 7, 13, 5, 15, 12, 8};

     System.out.println(testArr);
     System.out.println(mode(testArr));
     System.out.println("average: " + avg(testArr));
     System.out.println("range: " + range(testArr));
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
          return "mode:" + i;
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

  public static int findmin(int[] arr){
    int min = 99999;
    //int minLoc = -1;
    for(int i = 0; i < arr.length - 1; i++){
      if(arr[i] < min) {
        min = arr[i];
        //minLoc = i;
      }
    }
    return min;
  }

  public static int range(int[] arr){
    return (findMax(arr) - findmin(arr));
  }

  public static int median(int[] arr){
    int min = arr[i];
    int minLoc = i;
    int temp = arr[i];
    for (int j = i + 1; j < arr.length; j++) {
      if(arr[j] < min) {  // min
          min = arr[j];
          minLoc = j;
      }
    }
  return arr;

  }

}// class
