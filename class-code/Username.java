import java.util.*;

public class Username {
  public static void main(String[] args) {
      // create an instance of the Scanner
      Scanner s = new Scanner(System.in);

<<<<<<< HEAD
      // ask the user their first name 
=======
      // ask the user their first name
>>>>>>> d721fb9ad0c84b70ccd9772439c1b2c1cf3e5d2f
      System.out.print("Please enter your first name: ");
      String fName = s.nextLine();

      // ask the user their last name
      System.out.print("Please enter your last name: ");
      String lName = s.nextLine();

      // ask the user their birthday in the form mm/dd/year
      System.out.print("Hi, " + fName + ", please enter your birthday in mm/dd/year format: " );
      String birthday = s.nextLine();

      // generate a username for that person based on their data
      String username = "";

      // only the first letter of the first name
      username += fName.substring(0, 1);

<<<<<<< HEAD
      // final two letter of the last name (depends on how long the name is)
      username += lName.substring(lName.length() - 2);

      System.out.println("Here's your username, write it down because there's no way of getting it again.");
      System.out.println(username);

=======
      // final two letters of the last name (depends on how long the name is)
      username += lName.substring(lName.length() - 2);

      // grab the month of birth (must be 2 characters)
      if (birthday.indexOf("/") == 2) {
        username += birthday.substring(0, 2);
      } else {
        username += "0";
        username += birthday.substring(0, 1);
      } // end if/else

      // grab last two digits of birthyear
      username += birthday.substring(birthday.length() - 2);

      // add domain name
      username += "@anonymous.org";

      System.out.println("Here's your username, write it down because there's no way of getting it again.");
      System.out.println(username);

      System.out.println("─────█─▄▀█──█▀▄─█─────");
      System.out.println("────▐▌──────────▐▌────");
      System.out.println("────█▌▀▄──▄▄──▄▀▐█────");
      System.out.println("───▐██──▀▀──▀▀──██▌───");
      System.out.println("──▄████▄──▐▌──▄████▄──");

>>>>>>> d721fb9ad0c84b70ccd9772439c1b2c1cf3e5d2f
  } // end main method

} // end class
