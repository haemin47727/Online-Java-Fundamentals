package labs_examples.static_nonstatic.labs;
//3) A static method calling a static method in another class
public class Another extends Same {

    public static void main(String[] args) {
        Main.static2();
        Another another = new Another();
        //5) A non-static method calling a non-static method in the same class
        another.nonStatic();
    }
    @Override
    public void nonStatic() {
        System.out.println("nonStatic in another class");
    }





}
