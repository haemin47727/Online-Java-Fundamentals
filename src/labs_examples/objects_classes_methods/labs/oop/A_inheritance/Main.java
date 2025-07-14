package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Main {
    public static void main(String[] args){
        Medicine medicine = new Medicine("12/31/2027" , "generic");
        Medicine medicine2 = new Medicine("Stomach discomfort");
        Acetaminophen acetaminophen1 = new Acetaminophen("08/25/2026" , "acetaminophen");
        acetaminophen1.setUsageSideEffect("pain" , "gastric acid");
        System.out.println(acetaminophen1);
        Peptobismol pepto1 = new Peptobismol("Stomach issue");
        Peptobismol pepto2 = new Peptobismol(medicine2);
        System.out.println(pepto2);
        System.out.println(acetaminophen1);

    }
}
