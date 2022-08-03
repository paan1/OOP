public class Pro4_64010476 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon otg1 = new Octagon(9, "green", true);
        System.out.println("{Octagon}\n" + otg1.toString());

        System.out.println("\nCloning...\n");
        Octagon otg2 = (Octagon)otg1.clone();
        
        System.out.println("{Octagon(Clone)}\n" + otg2.toString());

        int eq = (otg1.compareTo(otg2));

        if(eq == 1)
        System.out.println("Octagon greater than clone");
        else if(eq == -1)
        System.out.println("Octagon less than clone");
        else
        System.out.println("Octagon equal to clone");
    }
}