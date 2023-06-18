public class Loops {

    public static void main(String[] args) {
        // creating an object to call out the non-static

        // class, a new name = a new function/object
        Loops loops = new Loops();
        loops.originalForLoop();

    }

    public void originalForLoop() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
