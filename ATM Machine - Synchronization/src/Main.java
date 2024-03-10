public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("John", 100, atm);
        Customer c2 = new Customer("Ajay", 500, atm);
        Customer c3 = new Customer("Joy", 200, atm);

        c1.start();
        c2.start();
        c3.start();
    }
}