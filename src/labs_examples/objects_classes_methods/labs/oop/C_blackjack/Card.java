package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    char suits;
    int cardValue;
    String ranks;
    public Card(){};
    public Card(String element , char symbol){
        this.ranks = element;
        this.suits = symbol;

    }
}
