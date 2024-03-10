class Customer extends Thread {
    ATM atm;
    String name;
    int amount;

    Customer(String str, int amount, ATM atmMachine) {
        this.atm = atmMachine;
        this.amount = amount;
        this.name = str;
    }

    public void run() {
        atm.USEatm(this.name, this.amount);
    }
}