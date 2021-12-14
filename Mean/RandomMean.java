import java.util.*;
public class RandomMean{
   public static void main(String[] args) {
     double arry [] = new double[100];
     for(int i = 0; i < 100; i++) {
       double randomNumbers = (double)Math.round(Math.random()*100);
       arry[i] = randomNumbers;
   }
}
   //Average
   public static double avg(int[] arry) {
  double total = 0.0;
for(int i=0; i<arry.length; i++) {
total += arry[i];
}
double average = total / arry.length;
System.out.println(Arrays.toString(arry));
return average;
}

}
