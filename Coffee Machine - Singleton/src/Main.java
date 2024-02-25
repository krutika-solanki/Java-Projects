import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        CoffeeMachine coffeeMachine1 = CoffeeMachine.getInstance();
        Scanner sc1 = new Scanner(System.in);

        System.out.println(coffeeMachine1 == coffeeMachine);
        System.out.println(coffeeMachine1.equals(coffeeMachine));

        while (true) {
            System.out.println("\n1. Fill up ingredients\n2. Checking amount of ingredients\n3. Get coffee\n4. Exit");
            System.out.println("\nEnter your choice");
            int choice = sc1.nextInt();
            switch (choice) {
                case 1:
                    coffeeMachine1.fillupIngredients();
                    break;
                case 2:
                    coffeeMachine.checkingQuantities();
                    break;
                case 3:
                    coffeeMachine.makeCoffee();
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Please enter valid choice");
            }
        }
    }
}