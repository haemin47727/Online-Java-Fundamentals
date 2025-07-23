package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackController {
        static Player user;
        static Player computer;
        static Scanner scanner;
        static int playCount = 0;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.populateDeck();


        System.out.println("What is your name?");
        computer = new Player("Computer");
        user = new Player(scanner.nextLine());
        playBlackJack(deck);



    }

    public static void playBlackJack(Deck deck) {
        playCount++;


        deck.deal(user);
        deck.deal(computer);
        int choice = 0;
        do {
            System.out.println("Your hand is " + user.hand +
                    "\nand the computer's first card is "
                    + computer.hand.cards.getFirst() +
                    "\nDo you want to hit or stand? Type 1 for hit 2 for stand");
             choice = scanner.nextInt();
            if (choice == 1) {
                deck.drawCard(user.hand);

                boolean moreThan21 = user.hand.handBust();
                if(moreThan21) {
                    break;
                }
            }
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid number. Try again");
                choice = scanner.nextInt();
            }
        } while (choice != 2);

        boolean wantsCard = computer.computerAI(computer.hand.getHandValue());
        while (wantsCard == true) {
            deck.drawCard(computer.hand);
            System.out.println("The computer hit");
            wantsCard = computer.computerAI(computer.hand.getHandValue());

        }
        System.out.println("The computer had " + computer.hand);


        if(user.hand.getHandValue() > 21) {
            System.out.println("You bust");
        } else if(computer.hand.getHandValue() > user.hand.getHandValue()){
            if(computer.hand.getHandValue() < 22){
                System.out.println("Computer wins");
            } else System.out.println("You win");
        } else if(computer.hand.getHandValue() == user.hand.getHandValue()){
            System.out.println("Draw");
        } else System.out.println("You win");


        System.out.println("Do you want to play again? Type yes or no");
        scanner.nextLine();//throws away \n after nextInt
        String playAgain = scanner.nextLine();
        if(playAgain.equalsIgnoreCase("yes")){
            playBlackJack(deck);
        }
        System.out.println("You played " +playCount + " number of times");
    }

}

