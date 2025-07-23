package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    Card[] deckCards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<>();


    public void populateDeck() {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        char[] suites = {'♠', '♦', '♥', '♣'};
        int[] values = { 1, 2 , 3 , 4 , 5 , 6 , 7, 8, 9, 10, 10, 10, 10};
        int index = 0;
        // for (int i = 0; i < cards.length; i++) {
            for (int s = 0; s < suites.length; s++) {
                for (int r = 0; r < ranks.length; r++) {
                    deckCards[index] = new Card(ranks[r], suites[s], values[r]);
                    index++;
                }
            }
    }
    public void drawCard(Hand playerHand){
        Random random = new Random ();
        int number = 0 ;
        do{
            number = random.nextInt(52);

        }while (
                usedCards.contains(number)
        );
        usedCards.add(number);
        if(usedCards.size() == 52) {
            System.out.println("You drew the last card. Shuffling new deck");
            populateDeck();
        }
        playerHand.cardAdd( deckCards[number] );



    }
    public void deal(Player player){


        Hand playerHand = player.getHand();
        playerHand.cards.clear();
        drawCard(playerHand);
        drawCard(playerHand);



        //player.setHand(playerHand);

    }
}
