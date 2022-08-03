public class Pro2_64010476 {
  public static void main(String[] args) {
      RegularPolygon Polygon1= new RegularPolygon();
      RegularPolygon Polygon2 = new RegularPolygon(6, 4);
      RegularPolygon Polygon3 = new RegularPolygon(10 , 4, 5.6, 7.8);
      System.out.println("The perimeter of polygon1 is "+Polygon1.getPerimeter());
      System.out.println("The area of polygon1 is "+Polygon1.getArea());
      System.out.println("The perimeter of polygon2 is "+Polygon2.getPerimeter());
      System.out.println("The area of polygon2 is "+Polygon2.getArea());
      System.out.println("The perimeter of polygon3 is "+Polygon3.getPerimeter());
      System.out.println("The area of polygon3 is "+Polygon3.getArea());
  }
}

