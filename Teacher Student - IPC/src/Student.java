public class Student extends Thread{
    String name;
    WhiteBoard wb;

    Student(String name, WhiteBoard wb) {
        this.name = name;
        this.wb = wb;
    }

    public void run() {
        wb.Attendence();
        int i = 0;
        while (i < 3) {
            System.out.println(name + " is reading " + wb.Read());
            System.out.flush();
            i++;
        }
    }
}
