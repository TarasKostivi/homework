package homeWork4;

public class Rectangle {
    private int length;
    private int wight;

    Rectangle(){

    }

    Rectangle(int length, int wight){
        this.length = length;
        this.wight = wight;
    }

    public int getLength(){
        return this.length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getWight(){
        return this.wight;
    }
    public void setWight(int wight){
        this.wight = wight;
    }


    public int getPerimeter(){
        return 2 * (length + wight);
    }
    public int getArea(){
        return length * wight;
    }

    public void print(){
        System.out.println("Perimeter : " + getPerimeter());
        System.out.println("Area : " + getArea());
    }
}
