public class ATM {
    public void CheckBalance(String str) {
        System.out.print(str + " is checking");
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
        System.out.println(" Balance");
    }

    public void WithdrawBalance(String str, int amount) {
        System.out.print(str + " is withdrawing ");
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
        System.out.println(amount);
    }

    synchronized public void USEatm(String str, int amount) {
        CheckBalance(str);
        WithdrawBalance(str, amount);
    }
}
