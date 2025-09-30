package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    char suits;
    String ranks;
    int value;

    public Card() {
    }

    public Card(String element, char symbol, int values) {
        this.ranks = element;
        this.suits = symbol;
        value = values;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return suits + ranks;
    }
}
