import java.util.Scanner;
/**
 * To convert the temperature from celsius to fahrenheit
 * @ThomasQuigley 
 */
public class Main {


  public static void main(String[] args) {
    // creating the scanner
    Scanner input = new Scanner(System.in);

    // ask for the temperature they want to convert
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");
    
    int celsius = input.nextInt();

    // convert the tempature to fahrenheit
    int fahrenheit = (celsius * 9)/5 + 32;
    

    // give them their new temperature
    System.out.println(celsius + "C is the same as " + fahrenheit + "F");
  }
}
