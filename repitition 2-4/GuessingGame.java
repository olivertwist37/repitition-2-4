import java.util.Scanner;
import java.lang.Math;
public class GuessingGame{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
        int tries=1;
        int number = (int) (Math.random() * (100-1+1)+1);
        for(int i=0;i<1;i++){
        System.out.println("What is your guess?  ");
        int guess = myObj.nextInt();
        if(guess==number){
          System.out.println("You've guessed my number! Good job! It only took you "+tries+" tries");  
        }else if(guess>number){
         System.out.println("too high ....");
         i--;
         tries++;
        }else{
         System.out.println("too low ....");
         i--;
         tries++;
        }
      }
    }
}
