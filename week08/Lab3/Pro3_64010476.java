
public class  Pro3_64010476{
	public static void main(String[] args) {
		Rectangle rtg1 = new Rectangle(9, 6, "yellow", true);
        Rectangle rtg2 = new Rectangle(6, 9, "blue", false);
        Rectangle rtg3 = new Rectangle(6.5, 9, "red", true);

        System.out.println("{Rectangle#1}\n" + rtg1.toString() + "\n");
        System.out.println("{Rectangle#2}\n" + rtg2.toString() + "\n");
        System.out.println("{Rectangle#3}\n" + rtg3.toString() + "\n");

        System.out.println("{Rectangle#1} is " + (rtg1.equals(rtg2) ? "" : "not ") + "equal to {Rectangle#2}");
        System.out.println("{Rectangle#1} is " + (rtg1.equals(rtg3) ? "" : "not ") + "equal to {Rectangle#3}");
}
}