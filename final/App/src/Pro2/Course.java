package Pro2;


import java.util.Arrays;

public class Course {
    private String[] studentsList = {};

    public Course() {

    }

    public void addStudent(String name) {
        int checkValued = 0;
        System.out.printf("Add new student : %s\n",name);
        for (int i = 0; i < studentsList.length; i++) {
            if (name == studentsList[i]) {
                checkValued++;
                break;
            }
        }
        if (checkValued == 0){
        studentsList = Arrays.copyOf(studentsList, studentsList.length + 1);
        studentsList[studentsList.length - 1] = name;}
        else System.out.println("This name is already in the course");
    }

    public void dropStudent(String name) {
        System.out.println("\nDrop student name: " + name);
        String[] temp = new String[studentsList.length];
        int n = 0;
        for (int i = 0; i < studentsList.length; i++) {
            if (studentsList[i] == name) {
                n++;
                name = "";//if want to delete the same number ,just delete this line ;Tx10
            } else
                temp[i-n] = studentsList[i];
        }
        studentsList = Arrays.copyOf(temp,temp.length-n);
    }

    public void displayStudent() {
        System.out.println("\ndisplay student in this course");
        for (int i = 0; i < studentsList.length; i++) {
            System.out.println("student "+(i+1)+": "+studentsList[i]);
        }
    }

    public void clear() {
        studentsList = Arrays.copyOf(studentsList, 0);
    }
}