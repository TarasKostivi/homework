package homeWork5.someMotocyrcle;

public class Engine extends Motorcycle{
    private String model;
    private double type;

    Engine(String modelND, String specification, int year, String color, int wheels, String model, double type){
        super(modelND, specification, year, color, wheels);

        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getType() {
        return type;
    }

    public void setType(double type) {
        this.type = type;
    }

    @Override
    public boolean start(){
        if (type > 0){
            System.out.println("GO");
            return true;
        }else {
            System.out.println("Out of energy! Fill the tank");
            return false;
        }
    }
}
