import java.util.Scanner;

public class Objective2 {
    public static void main (String [] args){
        int num = 50;
        int min = 0;
        int max = 100;
        int guesses = 1;
        Scanner input = new Scanner (System.in);
        System.out.println("Is your number "+ num+"?");
        String str = input.nextLine();
        while (!str.equals("correct")){
            if (str.equals("lower")){
                max = num-1;
            }
            if (str.equals("higher")){
                min = num+1;
            }
            guesses ++;
            double x = Math.random();
            num = (int)(x*(max-min)+min);
            System.out.println("Is your number "+num+"?");
            str = input.nextLine();
        }
        System.out.println("This program correctly guessed your number, "+num+", after "+guesses+" attempts!");
    }
}
