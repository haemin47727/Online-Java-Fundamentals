package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public boolean handBust() {
        return getHandValue() > 21;
    }

    public void cardAdd(Card playersCard) {
        cards.add(playersCard);
    }

    public int getHandValue() {
        int handValue = 0;
        for (Card card : cards) {
            handValue += card.getValue();
        }
        return handValue;
    }

    @Override
    public String toString() {
        return cards + " value: " + getHandValue();
    }

}
