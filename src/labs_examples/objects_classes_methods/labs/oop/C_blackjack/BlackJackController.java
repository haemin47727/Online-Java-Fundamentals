package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackJackController {
    public static void main(String[] args){
        Deck deck = new Deck();
        Card card = new Card();
        Hand hand = new Hand();
     //   Player player1 = new Player("James" , "2♦" , 500 );
        deck.populateDeck();
        System.out.println("The player's value is " + hand.calculateScore());
    }
}
