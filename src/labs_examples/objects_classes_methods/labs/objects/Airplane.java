package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {
    public static void main(String[] args) {

    FuelTank tank = new FuelTank(599.5, 50);
    FuelTank tank2 = new FuelTank();
    tank2.setCapacity(22.5);
    tank2.setLevel(50);
    Plane plane = new Plane(tank , "Delta" , "White");
    System.out.println("The plane has " + plane.getTank().getCapacity() + " fuel capacity with current fuel level of " +
            plane.getTank().getLevel() + " in a model of " + plane.getColor() + " " + plane.getModel());
    System.out.println(plane);
    }
}
class FuelTank {
    private double FuelCapacity;
    private int FuelLevel;


    FuelTank(double capacity, int level) {
        FuelCapacity = capacity;
        FuelLevel = level;
    }
    FuelTank(){}

    public double getCapacity() {
        return FuelCapacity;
    }

    public void setCapacity(double capacity) {
        FuelCapacity = capacity;
    }

    public int getLevel() {
        return FuelLevel;
    }

    public void setLevel(int level) {
        FuelLevel = level;
    }
    @Override
            public String toString(){
        return "FuelTank's capacity is " + FuelCapacity + " and level is " + FuelLevel;
    }
}

class Plane {
    private FuelTank tank;
    private String model;
    private String color;
    Plane(FuelTank tank , String model, String color){
        this.tank = tank;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public FuelTank getTank() {
        return tank;
    }

    public void setTank(FuelTank tank) {
        this.tank = tank;
    }
    @Override
    public String toString(){
        return "The plane model : " + model + " color : " + color + " tank : " + tank;
    }
}