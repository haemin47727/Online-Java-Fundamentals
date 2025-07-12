package labs_examples.objects_classes_methods.labs.objects;

public class Controller {
    public static void main(String []args){
        POJO a = new POJO("up");
        POJO b = new POJO("down" , 3);
        System.out.println(a.direction + "\n" + b.direction + b.howLong);
    }
}
