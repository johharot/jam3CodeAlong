import java.util.Scanner;

public class excercise {

    public static void main(String[] args) {
        excercise loop = new excercise();
        loop.forMethod();

    }


    public void forMethod() {
    Scanner userInput = new Scanner(System.in);

    System.out.println("Dylan and Eric are the best!");

    String message = userInput.nextLine();

     for (int i = 0; i < 5; i++) {
            System.out.println(message + " Indeed, they are!");
     }
    userInput.close();
    }
}
