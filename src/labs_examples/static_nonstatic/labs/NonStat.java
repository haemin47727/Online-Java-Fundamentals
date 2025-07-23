package labs_examples.static_nonstatic.labs;
//6) A non-static method calling a non-static method in another class
public class NonStat {
    public static void main(String[] args){
        NonStat nonstat = new NonStat();
        nonstat.nonStat();
    }
    public static void sameCl(){
        System.out.println("Same Class");
    }
    public void nonStat(){
        Same same = new Same();
        same.nonStatic();
        //7) A non-static method calling a static method in the same class
        sameCl();
        //8) A non-static method calling a static method in another class
        Main.static2();
    }
}
