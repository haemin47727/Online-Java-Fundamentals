package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Medicine {
    private String expDate;
    private String genName;
    private String route;
    private int time;
    private String usage;

    public Medicine(){};
    public Medicine(String expDate, String name) {
        this.expDate = expDate;
        this.genName = name;
    }
    public Medicine(String usage) {
        this.usage = usage;
    }
    public String getExpDate(){
        return expDate;
    }
    public void setExpDate(String expDate){
        this.expDate = expDate;
    }
    public int useUntil(int expDate){
        return expDate;
    }
    public String getUsage(){
        return usage;
    }
    public void setUsage(String usage){
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "expDate='" + expDate + '\'' +
                ", genName='" + genName + '\'' +
                ", route='" + route + '\'' +
                ", time=" + time +
                ", usage='" + usage + '\'' +
                '}';
    }
}


