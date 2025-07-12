package labs_examples.objects_classes_methods.labs.methods;

public class Toy {
    String name;
    int years;

    public Toy(String a, int years) {
        this.name = a;
        this.years = years;
    }

    public void printName() {
        System.out.println(name);
    }
}