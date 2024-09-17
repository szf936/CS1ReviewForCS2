import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2023;
        System.out.println("Nevermind, we were founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        CoffeeDrink specialOfThedAy = new CoffeeDrink(1, "Rum", false);
        specialOfTheDay(specialOfThedAy);
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        CoffeeDrink MatchaCoffee = new CoffeeDrink(12, "Matcha", false);
        CoffeeDrink LavanderCoffee = new CoffeeDrink(3, "Lavander", true);

        // TODO
        // Print out the order details
        System.out.println("\n");
        System.out.println("You ordered the following coffees: ");
        MatchaCoffee.printInfo();
        LavanderCoffee.printInfo();

    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        Random rand = new Random();
        int rand_int1 = rand.nextInt(30);
        System.out.println("Discount is " + rand_int1 + "%");
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(CoffeeDrink coffeeDrink) {
        // TODO
        System.out.println("\nThis is the special of the day: ");
        coffeeDrink.printInfo();
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
    }

    // Method to show loops
    public void countCups() {
        System.out.println("\nCounting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5


        // Print 2, 5, 8, 11


        // Print 8 to 0

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " ");
        }
        System.out.println('\n');
        for (int i = 2; i <= 11; i += 3) {
            System.out.println(i + " ");
        }
        System.out.println('\n');
        for (int i = 8; i >= 0; i--) {
            System.out.println(i + " ");
        }
        System.out.println('\n');

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        CoffeeDrink RedGuavaCoffee = new CoffeeDrink(9, "Red Guava", false);
        CoffeeDrink BlueSparklingCoffee = new CoffeeDrink(3, "Blue", true);
        CoffeeDrink MatchaCoffee = new CoffeeDrink(12, "Matcha", false);
        CoffeeDrink LavanderCoffee = new CoffeeDrink(3, "Lavander", true);
        Random rand = new Random();
        double rand_double1 = rand.nextDouble(1);
        if(rand_double1 <= 0.25) {
            System.out.println("We recommend this coffee:");
            RedGuavaCoffee.printInfo();
        } else if (rand_double1 <= 0.5) {
            System.out.println("We recommend this coffee:");
            BlueSparklingCoffee.printInfo();
        } else if (rand_double1 <= 0.75) {
            System.out.println("We recommend this coffee:");
            MatchaCoffee.printInfo();
        } else if (rand_double1 <= 1) {
            System.out.println("We recommend this coffee:");
            LavanderCoffee.printInfo();
        }

        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
    }
}

