public class Consumer extends Thread {

    MyData data;

    Consumer(MyData data) {
        this.data = data;
    }

    public void run() {
        int i = 1;
        while (i < 11) {
            System.out.println("Consumer " + data.getData());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
