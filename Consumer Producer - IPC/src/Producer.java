public class Producer extends Thread {

    MyData data;

    Producer(MyData data) {
        this.data = data;
    }

    public void run() {
        int i = 1;
        while (i < 11) {
            data.setData(i);
            System.out.println("Producer " + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
