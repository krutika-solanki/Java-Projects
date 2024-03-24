public class WhiteBoard {
    String Text;
    int NumberOfStudents = 0;
    int count = 0;

    void Attendence() {
        NumberOfStudents++;
    }

    synchronized public void Write(String t) {
        while (count != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        Text = t;
        count = NumberOfStudents;
        notifyAll();
    }

    synchronized public String Read() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        String t = Text;
        count--;
        if (count == 0)
            notify();
        return t;
    }
}
