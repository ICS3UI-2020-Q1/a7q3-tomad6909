import java.util.Scanner;
/**
 * This program will produce a pattern of a random number of asteriks between 1 and 5 along the page
 * @author David Toma
 */
public class Main {

  // create a method
  public static void integer(int userInput){
    // create a for statement to determine the random number
    for(int i = 0; i < userInput; i++){
      int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
    // create a for statement to determine how many * are going to be printed
    for(int j = 0; j < randNum; j++){
      System.out.print("*");
    }
    System.out.println("");
  } 
}
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // input the number of lines that the user wants
    integer(7);
    
  }
}
