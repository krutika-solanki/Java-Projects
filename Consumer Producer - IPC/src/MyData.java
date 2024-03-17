public class MyData {
    int data;
    boolean flag = true;

    synchronized public void setData(int val) {
        if (flag != true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.data = val;
        flag = false;
        notify();
    }

    synchronized public int getData() {
        if (flag == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        int x = data;
        flag = true;
        notify();
        return x;
    }
}
