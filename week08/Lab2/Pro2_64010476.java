public class Pro2_64010476 {

    public static void main(String[] args) {
        GeometricObject[] squares = { new Square(4.5), new Square(14), new Square(8.2), new Square(12),
                new Square(10) };

        for (int i = 0; i < squares.length; i++) {
            System.out.println("Square " + (i + 1));
            System.out.println("Area: " + squares[i].getArea());
            ((Square) squares[i]).howToColor();
        }
    }
}