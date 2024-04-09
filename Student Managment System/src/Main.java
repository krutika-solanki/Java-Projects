import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter your name, department, bloodGroup, and phoneNumber respectivelly");
        String name = sc.nextLine();
        String dep = sc.nextLine();
        String bg = sc.nextLine();
        String phone = sc.nextLine();
        Student student1 = new Student(name, dep, bg, phone);
        students.add(student1);
        System.out.println("Student is added successfully");
    }

    public void removeStudent() {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Enter the name of student you want to remove");
        String name = sc.nextLine();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                iterator.remove();
                System.out.println("Student named as " + name + " is removed successfully.");
                return;
            }
        }
        System.out.println("Student named as " + name + " is not Found");
    }

    public void getDetails() {
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        for (Student student : students) {
            if (student.name.equals(name)) {
                System.out.println(student);
            }
        }

    }

    public void displayAll() {
        System.out.println("Student List");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main stuManag = new Main();

        while (true) {
            System.out.println("\n==========================================================================================");
            System.out.println("\n1.add student\n2.remove student\n3.get details of student\n4.display all students\n5.exit");
            System.out.println("\n\nEnter your choice");
            int x = sc.nextInt();
            switch (x) {
                case 1 -> stuManag.addStudent();
                case 2 -> stuManag.removeStudent();
                case 3 -> stuManag.getDetails();
                case 4 -> stuManag.displayAll();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid Choice");
            }

        }
    }
}