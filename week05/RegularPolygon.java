class RegularPolygon {
    private int n = 3; 
    private double side = 1;
    private double x = 0; 
    private double y = 0; 
  
    public RegularPolygon() {
  
    }
  
    public RegularPolygon(int n, double side) {
        setN(n); 
        setSide(side);
    }
  
    public RegularPolygon(int n, double side, double x, double y) {
        
        setN(n); 
        setSide(side);
        this.x = x;
        this.y = y;
    }
  
    public int getN() {
        return n;
    }
  
    public double getside() {
        return side;
    }
  
    public double getX() {
        return x;
    }
  
    public double getY() {
        return y;
    }
  
    public double getPerimeter() {
        return n * side;
    }
  
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
  
    public void setN(int n) {
        if(n>=3){this.n = n;}
    }
  
    public void setSide(Double side) {
        if(n>0){this.side = side;}
    }
  
    public void setX(Double x) {
        this.x = x;
    }
  
    public void setY(Double y) {
        this.y = y;
    }
  }