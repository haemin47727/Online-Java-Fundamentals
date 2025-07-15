package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Tylenol extends Acetaminophen{
    public Tylenol(){

    };
    public Tylenol(String usage, String sideEffect){
        super(usage, sideEffect);
    }
    @Override
    public String toString(){
        return "Tylenol has expiration date of " + getExpDate() + "with usage of " + getUsage() + "and side effect of"
                +getSideEffect();
    }
}
