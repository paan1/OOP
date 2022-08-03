public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
    private double side;

    public Octagon(){
    }

    public Octagon(double side){
        setSide(side);
    }

    public Octagon(double side, String color, boolean filled){
        setSide(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        if(side > 0){
        this.side = side;
        }
    }

    public double getArea(){
        return (2 + 4/22) * side * side;
    }

    public double getPerimeter(){
        return 8 * side;
    }

    public int compareTo(Octagon j){
        if(getArea() > j.getArea())
        return 1;
        else if(getArea() < j.getArea())
        return -1;
        else return 0;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String toString(){
        return super.toString() + 
        "Area : " + String.format("%.2f", getArea()) +
        "\nPerimeter : " + String.format("%.2f", getPerimeter());
    }
}