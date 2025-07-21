package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int handValue;
    public Hand(){
    }
    public int calculateScore(){
      for(Card card : cards){
          handValue = card.getValue();
          // card.getValue to add to the hand value.
      }
      return handValue;
    }
    public void cardAdd(Card playersCard){
        cards.add(playersCard);

    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }
}
