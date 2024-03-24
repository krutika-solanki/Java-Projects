public class Teacher extends Thread{
    WhiteBoard wb;
    String[] lesson = {"Java is ProgrammingLang", "Robust", "Platform Independent"};

    Teacher(WhiteBoard wb) {
        this.wb = wb;
    }

    public void run() {
        for (String s : lesson) {
            System.out.println("Teacher : " + s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            wb.Write(s);
        }
    }
}
