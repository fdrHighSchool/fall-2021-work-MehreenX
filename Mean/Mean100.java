import java.util.*;

public class Mean100{
  public static void main(String[] args) {
    double arry[] = new double[100];
    double i = 0;

// 10 numbers that the mean = 5
    arry[0] = 2;
    arry[1] = 2;
    arry[2] = 3;
    arry[3] = 4;
    arry[4] = 5;
    arry[5] = 5;
    arry[6] = 6;
    arry[7] = 7;
    arry[8] = 8;
    arry[9] = 8;

//calculation of  mean
 double total = (2+2+3+4+5+5+6+7+8+8);
 double mean = total / arry.length;
 System.out.print("Mean = " + mean);

  }
}
