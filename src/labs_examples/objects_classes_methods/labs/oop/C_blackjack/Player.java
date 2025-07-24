package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    String name;
    Hand hand;
    int potValue;
    int bett;

    public Player (){
        hand = new Hand();
    };
    public Player(String name){
        this.name = name;
        hand = new Hand();
    }

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
    public int addPotValue(int bet){
        bett = bet;
        potValue += bett;
        return potValue;
    }
    public int subtractPotVal(int bet){
        bett = bet;
        potValue -= bett;
        return potValue;
    }
    public int getPotValue(){
        return potValue;
    }
    public void setPotValue(int potValue){
        this.potValue = potValue;
    }
    public String getName() {
        return name;
    }
}

