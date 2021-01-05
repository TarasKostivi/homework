package homeWork5.Car;

public class Wheel {
    private String brand;
    private String type;
    private String Seasonality;
    private double pressure;

    public Wheel(String brand, String type, String seasonality, double pressure) {
        this.brand = brand;
        this.type = type;
        this.Seasonality = seasonality;
        this.pressure = pressure;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeasonality() {
        return Seasonality;
    }

    public void setSeasonality(String seasonality) {
        Seasonality = seasonality;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", Seasonality='" + Seasonality + '\'' +
                ", pressure=" + pressure +
                '}';
    }

    public void pomp(){
        this.setPressure(this.getPressure() + 1);
        System.out.println("Колесо накачане = " + this.pressure + " aтмосфери");
    }

}
