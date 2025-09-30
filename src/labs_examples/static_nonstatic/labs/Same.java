package labs_examples.static_nonstatic.labs;

//2) A static method calling a non-static method in the same class
public class Same {
    public static void main(String[] args) {
        Same same = new Same();
        same.nonStatic();
    }

    public void nonStatic() {
        System.out.println("nonStatic in same class");
    }

}
