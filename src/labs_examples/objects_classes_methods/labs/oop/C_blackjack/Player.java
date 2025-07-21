package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    String name;
    Hand hand;
    int potValue;
    public Player (){};
    //public Player ("name" , "hand" , potValue){
    //}
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
    this.hand = hand;
    }
}

