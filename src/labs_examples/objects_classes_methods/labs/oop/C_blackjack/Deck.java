package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<>();


    public void populateDeck() {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        char[] suites = {'♠', '♦', '♥', '♣'};
        int[] values = { 1, 2 , 3 , 4 , 5 , 6 , 7, 8, 9, 10, 10, 10, 10};
        int index = 0;
        // for (int i = 0; i < cards.length; i++) {
            for (int s = 0; s < suites.length; s++) {
                for (int r = 0; r < ranks.length; r++) {
                    cards[index] = new Card(ranks[r], suites[s], values[r]);
                    System.out.println(index);
                    index++;
                }
            }


        for (Card card : cards){
            System.out.println(card);
        }
        System.out.println(Arrays.toString(cards));

    }
    public void deal(Player player){

        Random random = new Random ();
        Hand playerHand = new Hand();
        int number = random.nextInt(52) + 1;

        do{
            number = random.nextInt(52) + 1;

        }while (
        usedCards.contains(number)
        );
        playerHand.cardAdd(cards[number]);

        System.out.println("Random number will be at index of " + number + playerHand);
        player.setHand(playerHand);
        usedCards.add(number);
    }
}
