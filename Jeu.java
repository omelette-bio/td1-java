import java.util.Scanner;

public class Jeu {

    Scanner sc = new Scanner(System.in);

    // method to display text with a delay of 1s to make it more realistic
    public void displayText(String text){
        System.out.println("> "+text);
        // the part of the code that makes the delay
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // method to display the various choices of the player, the choices are in a String array
    public int choice(String[] choices){
        for (int i = 0; i < choices.length; i++) {
            System.out.print(i + 1 + ". " + choices[i] + "  ");
        }
        System.out.println();
        // setting up the scanner to get the player's choice, then closing it to avoid memory leaks
        int select = sc.nextInt();
        if (select > choices.length || select < 1) {
            select = 1;
        }
        return select;
    }


}