import java.util.Random;
import java.util.Scanner;
class NumberGame{
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100);
        int userGuess;
        int maxAttempts = 10;
        int totalAttempts = 0;
        int rounds = 0;
        int roundsWon = 0;
        int roundsLost = 0;

        while(true){
            randomNumber = random.nextInt(100);
            int attempts = 0;
            rounds++;
            System.out.println("Welcome to Number Guessing Game!");
            System.out.println("Guess a number between "+1+" and "+100+".");
            while(attempts < maxAttempts){

                userGuess = scanner.nextInt();
                if(!(userGuess >=1 && userGuess <= 100)){
                    System.out.println("Please enter a valid number!");
                    continue;
                }
                attempts++;
                
                if(randomNumber == userGuess){
                    roundsWon++;
                    System.out.println("Congratulations! You guessed the correct number.");
                    System.out.println("You have guessed in "+attempts+" attempts");
                    break;
                }
                else if(userGuess < randomNumber){
                    System.out.println("Sorry, your guess is too low.");
                }
                else{
                    System.out.println("Sorry, your guess is too high.");
                }
                if(attempts == maxAttempts){
                    if(randomNumber == userGuess){
                        break;
                    }
                    System.out.println("Sorry! You have reached maximum number of attempts.");
                    System.out.println("The actual number was "+randomNumber);
                    roundsLost++;
                }

            }
            
            

            totalAttempts+=attempts;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (playAgain.equals("no")) {
                break;
            }
        }
        
        System.out.println("Game over! You played " + rounds + " rounds and took a total of " + totalAttempts + " attempts.");
        System.out.println("Number of rounds won: "+roundsWon);
        System.out.println("Number of rounds lost: "+roundsLost);
        scanner.close();
    }

}


