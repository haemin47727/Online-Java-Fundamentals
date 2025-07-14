package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Acetaminophen extends Medicine {
    String sideEffect;
    public Acetaminophen(){super();};

    public Acetaminophen(String expDate, String name){
        super(expDate , name);
    }


    public void setUsageSideEffect(String usage , String sideEffect){
        this.sideEffect = sideEffect;
    }
    public String toString(){
        return "Acetaminophen family has side effect of " + sideEffect + "\n" + "exp date of " + getExpDate();
    }


}

