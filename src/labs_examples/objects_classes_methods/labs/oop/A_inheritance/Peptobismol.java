package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Peptobismol extends Medicine {
    public Peptobismol(){};
    public Peptobismol(String usage){
        super(usage);
    }
    public Peptobismol(Medicine medicine){
        super();
        this.setExpDate(medicine.getExpDate());
        this.setUsage(medicine.getUsage());

    }


}
