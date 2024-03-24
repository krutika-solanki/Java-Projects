public class Main {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher teacher = new Teacher(wb);
        Student stu1 = new Student("Vijay", wb);
        Student stu2 = new Student("Shyam", wb);
        Student stu3 = new Student("Ram", wb);
        teacher.start();
        stu1.start();
        stu2.start();
        stu3.start();
    }
}