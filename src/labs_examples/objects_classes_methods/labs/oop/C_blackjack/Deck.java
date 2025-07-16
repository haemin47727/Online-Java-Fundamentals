package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck {

        Card[] cards = new Card[52];
        ArrayList<Integer> usedCards = new ArrayList<>();


    public void populateDeck(){
        String[] ranks = {"Ace" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8"  , "9" , "10", "Jack" , "Queen" , "King" };
        char[] suites = {'♠' , '♦' , '♥' , '♣'};
        int index = 0;
        for(String element : ranks){
            for(char symbol : suites){
                cards[index] = new Card(element , symbol);
                index++;
            }
        }



    }
}
