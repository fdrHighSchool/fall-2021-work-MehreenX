import java.util.Scanner; //importing scanner class
public class RamdomNumber {
  public static void main(String[] args) {
    Scanner Num = new Scanner(System.in);
    //variables for the range
    int min = 1;
    int max = 12;

    //Generate random int value from 1 to 6
      System.out.println("Pick a random number from "+min+" to "+max+ ":");
      //user input
      int userAns = Num.nextInt();

      //set answer
      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

      //program output
      if(userAns == random_int){
        System.out.println("Yay, you did it T^T");
      }
      //when user guesses lower than the chosen number
      if(userAns < random_int){
        System.out.println("WRONGG, picked too low...");
      }
      //when user guesses higher than the chosen number
      if(userAns > random_int){
        System.out.println("WRONGGG, picked too high...");
      }
    }

}
