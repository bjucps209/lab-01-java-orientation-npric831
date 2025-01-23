import java.util.*;

public class Guess {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int secretnum = random.nextInt(11);
        int numguesses = 0;
        int guess = 0;

        while (guess != secretnum){
            guess = Integer.parseInt(scan.nextLine());
            numguesses += 1;
            
            if(guess < secretnum){
                System.err.println("Your guess is too low.");
            } else if (guess > secretnum) {
                System.err.println("Your guess is too high.");
            } else {
                System.err.println("You got it!!");
            }
            
        }
        System.err.println("It took you "+ numguesses + " guesses.");
    
    }
}
