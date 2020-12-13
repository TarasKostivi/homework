package homeWork5.someMotocyrcle;

public class MotorcycleFuel extends Motorcycle {
    private String fuelType;
    private double fuelCapacity;

    MotorcycleFuel(String modelNO, String specification, int year, String color, int wheels, String fuelType, double fuelCapacity){
        super(modelNO, specification, year, color, wheels);

        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelCapasity() {
        return fuelCapacity;
    }

    public void setFuelCapasity(double fuelCapasity) {
        this.fuelCapacity = fuelCapasity;
    }

    @Override
    public boolean start(){
        System.out.println(super.getColor());
        if (fuelCapacity > 0){
            System.out.println("Let's go");
            return true;
        }else {
            System.out.println("No more fuell");
            return false;
        }
    }
}
