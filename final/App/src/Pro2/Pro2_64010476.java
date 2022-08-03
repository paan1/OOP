package Pro2;


public class Pro2_64010476 {
    public static void main(String[] args) {
        Course course1 = new Course();
        System.out.println("-----------------------------------------------------");
        course1.addStudent("paan");
        course1.addStudent("poon");
        course1.addStudent("puun");
        course1.dropStudent("puun");

        course1.displayStudent();

        course1.clear();
        course1.displayStudent();
        System.out.println("-----------------------------------------------------");
    }
    
}