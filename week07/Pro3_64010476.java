

public class Pro3_64010476 {
    public static void main(String[] args) {
        Student student = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", 
        "012-345-6789", "somsak@mymail.com", 1);

        Staff staff = new Staff("Somsree", "2 Chalongkrung Road, Ladkrabang, BKK, 10520", 
        "012-445-6789", "somsree@mymail.com", 9, 3000, "Assistant");

        Faculty faculty = new Faculty("Somboon", "3 Chalongkrung Road, Ladkrabang, BKK, 10520", 
        "012-545-6789", "somboon@mymail.com", 8, 7000, "7", "Platinum");

        System.out.println(student.toString());

        System.out.println(staff.toString());

        System.out.println(faculty.toString());
    }
}