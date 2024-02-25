import java.util.Scanner;

class CoffeeMachine {
    private int coffeeQuant;
    private int waterQuant;
    private int milkQuant;
    private int sugarQuant;

    static private CoffeeMachine cf = null;

    private CoffeeMachine() {
        coffeeQuant = 0;
        waterQuant = 0;
        milkQuant = 0;
        sugarQuant = 0;
    }

    static CoffeeMachine getInstance() {
        if (cf == null) {
            cf = new CoffeeMachine();
        }
        return cf;
    }

    public void fillupIngredients() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cofffee amount");
        int amount = sc.nextInt();
        coffeeQuant += amount;
        System.out.println("enter water amount");
        int amount1 = sc.nextInt();
        waterQuant += amount1;
        System.out.println("enter milk amount");
        int am1 = sc.nextInt();
        milkQuant += am1;
        System.out.println("enter sugar amount");
        int am2 = sc.nextInt();
        sugarQuant += am2;

    }

    public void checkingQuantities() {
        System.out.println(cf);
    }

    public void makeCoffee() {
        if (sugarQuant <= 0 || coffeeQuant <= 0 || waterQuant <= 0 || milkQuant <= 0) {
            System.out.println("Please fill up the required ingredients before making coffee.");
        } else {
            sugarQuant--;
            waterQuant--;
            milkQuant--;
            coffeeQuant--;
            System.out.println("Your coffee is ready! Enjoyyy");
        }
    }

    public String toString() {
        return "\nSugar: " + sugarQuant + "\nWater: " + waterQuant + "\nmilk: " + milkQuant + "\ncoffee: " + coffeeQuant + "\n";
    }
}