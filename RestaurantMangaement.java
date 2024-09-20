package main;
import java.util.Scanner;

class DiscountCalculator{
    public double discount(int visit)
    {
        

        if (visit >= 5 && visit < 10) {
            return 0.05;  // 5% discount
        } else if (visit >= 10 && visit < 15) {
            return 0.10;  // 10% discount
        } else if (visit >= 15) {
            return 0.15;  // 15% discount
        } else {
            return 0.0;   // No discount for fewer than 5 visits
        }

    }
}
public class RestaurantMangaement {

    static double p_pizza = 120.0;
    static double p_pasta = 90.0;
    static double p_dragonChicken = 200.0;
    static double p_paneerTikka = 250.0;
    static double p_kebab = 40.0;
    static double p_coldDrink = 40.0;

    // to keep count of the no of items ordered
    static int pizza_c = 0;
    static int pasta_c = 0;
    static int dragonChicken_c = 0;
    static int paneerTikka_c = 0;
    static int kebab_c = 0;
    static int coldDrink_c = 0;

    //tax and other charge
    static final double tax_rate = 0.07;
    static final double service_charge = 0.10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DiscountCalculator obj = new DiscountCalculator();
        int choice;
        double Bill_Amount = 0.0;
        boolean order = true;


        System.out.println("\n========================================WELCOME TO ZAIKA RESTAURANT==============================================");
        
        System.out.println("enter your name");
        @SuppressWarnings("unused")
        String name_of_Visitor = sc.nextLine();

        System.out.println();
        System.out.println("please enter your number of visit in this restaurant");
        int num_visit = sc.nextInt();

        // give the menu
        while(order)
          {  System.out.println("Please select the number of food item of your choice from the menu");

            System.out.println("1. pizza   :      120/-");
            System.out.println("2. pasta   :      90/-");
            System.out.println("3. dragon chicken  : 200/-");
            System.out.println("4. paneer tikka   : 250/- ");
            System.out.println("5. kebab   :      40/-");
            System.out.println("6. cold drink   :     40");
            System.out.println("7. View Bill and checkout");
            System.out.println("\nenter the value here");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1: 
                        System.out.println("pizza");
                        pizza_c++;
                        Bill_Amount = Bill_Amount + (p_pizza );
                        break;
                case 2: 
                        System.out.println("pasta");
                        pasta_c++;
                        Bill_Amount = Bill_Amount + (p_pasta );
                        break;
                case 3: 
                        System.out.println("dragon chicken");
                        dragonChicken_c++;
                        Bill_Amount = Bill_Amount + (p_dragonChicken);
                        break;
                case 4:
                        System.out.println("paneer tikka");
                        paneerTikka_c++;
                        Bill_Amount = Bill_Amount + (p_paneerTikka);
                        break;
                case 5:
                        System.out.println("kebab");
                        kebab_c++;
                        Bill_Amount = Bill_Amount + (p_kebab);
                        break;
                case 6:
                        System.out.println("cold drink");
                        coldDrink_c++;
                        Bill_Amount = Bill_Amount + (p_coldDrink);
                        break;
                case 7:
                        System.out.println("proceed to checkout");
                        order = false;
                        break;
                default:
                        System.out.println("invalid choice");

            }
            System.out.println();
            
        }
        // Calculate the discount using the DiscountCalculator class
        double discountRate = obj.discount(num_visit);

        displayBill(Bill_Amount, discountRate);
        sc.close();
    }
    public static void displayBill(double Bill_Amount, double discountRate) {
        System.out.println("========== Your Final Bill ==========");

        if (pizza_c > 0) {
            System.out.println("Pizza (" + pizza_c + "): $" + String.format("%.2f", pizza_c * p_pizza));
        }
        if (pasta_c > 0) {
            System.out.println("pasta (" + pasta_c + "): $" + String.format("%.2f", pasta_c * p_pasta));
        }
        if (dragonChicken_c > 0) {
            System.out.println("dragon chicken (" + dragonChicken_c + "): $" + String.format("%.2f", dragonChicken_c * p_dragonChicken));
        }
        if (paneerTikka_c > 0) {
            System.out.println("paneer tikka (" + paneerTikka_c + "): $" + String.format("%.2f", paneerTikka_c * p_paneerTikka));
        }
        if (kebab_c > 0) {
            System.out.println("kebab (" + kebab_c + "): $" + String.format("%.2f", kebab_c * p_kebab));
        }
        if (coldDrink_c > 0) {
            System.out.println("Cold Drink (" + coldDrink_c + "): $" + String.format("%.2f", coldDrink_c * p_coldDrink));
        }
        
        // Discount calculation
        double discount = Bill_Amount * discountRate;
        double discountedTotal = Bill_Amount - discount;

        // Tax and service charge calculations
        double tax = discountedTotal * tax_rate;
        double serviceCharge = discountedTotal * service_charge;
        double finalTotal = discountedTotal + tax + serviceCharge;


        // Display tax, service charge, and final total
        System.out.println("Subtotal: $" + String.format("%.2f", Bill_Amount));
        System.out.println("Discount: $" + String.format("%.2f", discount) + " (" + (discountRate * 100) + "%)");
        System.out.println("Tax (7%): $" + String.format("%.2f", tax));
        System.out.println("Service Charge (10%): $" + String.format("%.2f", serviceCharge));
        System.out.println("Total Amount: $" + String.format("%.2f", finalTotal));

        System.out.println("Thank you for dining with us!");
    }
    
}
