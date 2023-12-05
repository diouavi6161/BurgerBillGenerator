import java.util.Scanner;

public class BurgerBillGenerator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the burger type(veg,Chicken): ");
        String BurgerType = scanner.nextLine();

        System.out.print("Enter burger size (small, medium, large): ");
        String BurgerSize = scanner.nextLine();

        System.out.print("Enter topping (chees, double chees, triple chees): ");
        String topping = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalCost = calculateTotalCost(BurgerType,BurgerSize, topping, quantity);

        System.out.println("Your Burger Bill:");
        System.out.println("Burger Type:"+ BurgerType);
        System.out.println("Pizza Size: " + BurgerSize);
        System.out.println("Topping: " + topping);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);

        scanner.close();
    }

    private static double calculateTotalCost(String BurgerType, String BurgerSize, String topping, int quantity) {
        
        double Cost = 0;

        switch(BurgerType){
            case "veg":
               Cost = 99;
               break;
            case "Chicken" :
                Cost = 120;
                break;
        }

        double baseCost=0;

        switch (BurgerSize) {
            case "small":
                baseCost = 5.99;
                break;
            case "medium":
                baseCost = 8.99;
                break;
            case "large":
                baseCost = 12.99;
                break;
        }

        double toppingCost = 0;

        switch (topping) {
            case "Chees":
                toppingCost= 10;
                break;
            case "double Chees":
                toppingCost = 20;
                break;
            case "triple Chees":
                toppingCost = 30;
                break;
        }

        return (Cost+baseCost + toppingCost) * quantity;
    }
}
