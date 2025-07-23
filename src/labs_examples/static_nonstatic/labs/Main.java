package labs_examples.static_nonstatic.labs;
//1) A static method calling another static method in the same class
public class Main {
    public static void main(String[] args){
        static2();
        System.out.println("main");
    }
    public static void static2(){
        System.out.println("static 2");
    }
}
