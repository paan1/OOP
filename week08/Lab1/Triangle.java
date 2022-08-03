public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3){
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        this(side1, side2, side3);
        setColor(color);
        setFilled(filled);
    }

    public double getSide1(){
        return side1;
    }
    public void setSide1(double side1){
        if(side1 > 0){
        this.side1 = side1;
        }
    }

    public double getSide2(){
        return side2;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }

    public double getSide3(){
        return side3;
    }
    public void setSide3(double side3){

        this.side3 = side3;
    }

    public double getArea(){

        if (side1 + side2 > side3  && side1 + side3 > side2 && side2 + side3 > side1)
        {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        return -1;
    }

    public double getPerimeter(){
        if (side1 + side2 > side3  && side1 + side3 > side2 && side2 + side3 > side1)
        {
        return side1 + side2 + side3;
        }
        return -1;
    }

    public String toString(){
        return super.toString() + 
        "Area : " + String.format("%.2f", getArea()) +
        "\nPerimeter : " + String.format("%.2f", getPerimeter());
    }
}