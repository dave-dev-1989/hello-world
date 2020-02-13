/*
 * Simple hello world application which will have 
 * more functions added over time.
 */
package helloworld;

//imports
import java.util.Scanner;
/**
 *
 * @author dave-dev-1989
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner object, fetch input and display a message
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Enter your name");
        
        String userName = inputReader.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
    
}
