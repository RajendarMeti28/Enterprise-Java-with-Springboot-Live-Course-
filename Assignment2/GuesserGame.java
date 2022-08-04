/*
    Since the game demonstrated by Hyder Abbas is pretty much cool and makes it clear about using classes and creating objects,
        I try to modify the game concept a little so that I can make it different as well improve my understandings towards LOOPs and CONDITIONAL statements..
    
    STRUCTURE OF THE GAME(CONCEPT)

    Guess Class --> Usec for guessing the game.
        It consists of three instance variables: low, high, guessNum.
        low and high are taken as inputs by the user so that we are defining a range for the number game.
        Using the boundaries we generate the guessNum.
    
    Umpire Classs --> In this class by creating object of Guess class, we retrieve the range as well as the guessNum.
        Then we ask the player the guess the number. 
        Using loops:
            We try to count no of tries the user take the guess the correct number.
            While guessing we give appropriate clues such that the user can predict the correct number using condition statements(if-else)


    In the Main class we output the no of tries the user had taken to guess the Number.

    That's all. Have some fun....
*/


import java.util.Scanner;

class Guesser{

    int low;
    int high;
    int guessNum;

    public int guessNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Guesser, Please give the range: lower boundary");
        low = input.nextInt();
        System.out.println("Guesser, Please give the range: upper boundary");
        high = input.nextInt();

        guessNum = (int)(Math.random()*high) + low;
        return guessNum;
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

}


class Umpire {
    int guesserNum, low, high;
    int count;

    public void collectNumFromGuesser(){
        Guesser g = new Guesser();
        guesserNum = g.guessNum();
        low = g.getLow();
        high = g.getHigh();
    }

    public int game(){

        Scanner input = new Scanner(System.in);
        
        System.out.println("\n\nHey Player the range of the number lies in " + low + " and " + high + "\n\n Now start playing the game by guessing..");
        int playerNum = -1;
        while(playerNum!=guesserNum){
            playerNum=input.nextInt();
            count++;

            if(playerNum <low || playerNum > high){
                System.out.println("Sorry that's an invalid number.. \n We are aborting the game.. Try again after some time..");
                System.exit(0);
            }

            if(playerNum<guesserNum){
                System.out.println("\nPlease try for a little bigger number");
            }
            else if(playerNum>guesserNum){
                System.out.println("\nPlease try for a litter smaller number");
            }
            else{
                break;
            }
            
        }


        return count;
    }

}

public class GuesserGame {

    public static void main(String[] args) {
        Umpire ump = new Umpire();
        ump.collectNumFromGuesser();
        int count = ump.game();
        System.out.println("\n\n Hey You have won..! \nNumber of tries for the correct guess is " + count + "\n Now play again for a better score!\n");
    }
    
}
