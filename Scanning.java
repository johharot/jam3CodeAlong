import java.io.File;
import java.util.Scanner;

public class Scanning {

    public static void main(String[] args) {
        Scanning scanning = new Scanning();
        // scanning.readUserInput();
        // scanning.readFromString();
        scanning.readFromFile();

    }

    public void readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have hair? ");
        String answer = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        // The ternary conditional operator ?: allows us to define expressions in Java.
        // It's a condensed form of the if-else statement that also returns a value.
        String concatenatedPiece = answer.toLowerCase().equals(new String("no")) ? "you have no hair?"
                : "you have a head full of hair?";

        System.out.println("You are " + age + " years of age and " + concatenatedPiece);

        scanner.close();
    }

    public void readFromString() {
        // \n is to use to print onto the next line
        String testString = "This is a test string \nto demonstrate how \nthe nextLine method works";
        // System.out.println(testString);
        Scanner s = new Scanner(testString);
        String firstLine = s.nextLine();
        System.out.println(firstLine);
        String secondLine = s.nextLine();
        System.out.println(secondLine);
        String thirdLine = s.nextLine();
        System.out.println(thirdLine);

        s.close();
    }

    public void readFromFile() {
        File textName = new File("test.txt");
        Scanner s = null;
        try {
            s = new Scanner(textName);
            // int firstInt = s.nextInt();
            // System.out.println("Here is the int from the file: " + firstInt);
            /*
             * while there are still ints in our file, we want to print them
             */

             while(s.hasNextInt()){
                System.out.println(s.nextInt());
             }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.close();
        }
    }
}
