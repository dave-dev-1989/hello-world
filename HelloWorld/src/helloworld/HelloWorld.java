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
        
        // displays length of supplied name
        System.out.println("Your name contains " + userName.length() + " letters.");
        
        //displays number of vowels and consonants in name
        int numVowels = vowelCount(userName);
        int numConsonants = userName.length() - numVowels;
        System.out.println("Your name contains " + numVowels + 
                " vowels and " + numConsonants + " consonants.");
    }
    
    /**
     * method to count number of vowels in a string
     * @param str the string to analyse
     */
    public static int vowelCount(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}
