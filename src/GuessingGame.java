import java.util.Scanner;

public class GuessingGame
{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int attempts = 1;
        System.out.println("Choose a difficulty: ");
        System.out.println("Type 1 for numbers 1 - 10");
        System.out.println("Type 2 for numbers 1 - 100");
        System.out.println("Type 3 for numbers 1 - 1000");
        System.out.println("Type 4 for numbers 1 - 10000");
        int max = 10;
        int exponent = input.nextInt();
        for (int i = 1; i< exponent;i++){
            max *= 10;
        }
        int num = (int)(max*Math.random()+1);
        System.out.println("Guess the random number between 1 and "+max+":");
        int guess = input.nextInt();
        while (guess != num){
            attempts ++;
            if (guess < num){
                System.out.println("Too low! Try again: ");
            }
            else{
                System.out.println("Too high! Try again: ");
            }
            guess = input.nextInt();
        }
        System.out.println(num+" is correct! You took "+attempts+" guesses to get the correct answer.");
    }
}
