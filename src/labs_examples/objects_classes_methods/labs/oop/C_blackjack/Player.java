package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    String name;
    Hand hand;
    int potValue;
    public Player (){
        hand = new Hand();
    };
    public Player(String name){
        this.name = name;
        hand = new Hand();
    }
    //public Player ("name" , Hand cards , potValue){
    //hand = cards;
    //}
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
    this.hand = hand;
    }
    public boolean computerAI(int total){
        if(total <= 16) {
            return true;
        } else return false;

    }
    public String getName() {
        return name;
    }
}

