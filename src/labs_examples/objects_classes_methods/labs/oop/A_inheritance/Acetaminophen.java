package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Acetaminophen extends Medicine {
    String sideEffect;
    public Acetaminophen(){};

    public Acetaminophen(String expDate, String name){
        super(expDate , name);

    }

    public String getSideEffect(){
        return sideEffect;
    }
    public void setUsageSideEffect(String usage , String sideEffect){
        super.setUsage(usage);
        this.sideEffect = sideEffect;
    }
@Override
    public String toString(){
        return "acetaminophen has expiration date of " + getExpDate() + " used for " + getUsage() + "but has" +
                "side effect of " + sideEffect;
}


}

