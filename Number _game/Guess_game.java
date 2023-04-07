import java.util.*;


class game {
    Random rand = new Random();
    private int compNo, inp;
    private int noOf = 10;

    public game() {
        compNo = rand.nextInt(100);
    }

    public void takeUserInput(int input) {
        this.inp = input;
    }

    public String isCorrectNumber() {
        return "your choice is correct";
    }

    public void noOfGuesses() {

        if (inp == compNo) {
            System.out.println(isCorrectNumber());
            System.out.println("Score is: "+noOf+"/10");
        } else if (inp > compNo) {
            System.out.println("Your guess is greater than expected Number");
            System.out.println("chances left: " +(noOf - 1));
            noOf--;
        } else {
            System.out.println("Your guess is less than expected Number.");
            System.out.println("Chances left: "+ (noOf - 1));
            noOf--;
        }

    }
}

public class Guess_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        game g = new game();
        System.out.println("lets get started, GUESS THE NUMBER");
        System.out.println("you will get 10 chances to guess the number ");
        for (int i = 0; i < 10; i++) {
            int choice = sc.nextInt();
            g.takeUserInput(choice);
            g.noOfGuesses();

}
}
}