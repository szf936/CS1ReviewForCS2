// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int num, String flav, boolean whipped) {
        numberOfCups = num;
        flavor = flav;
        hasWhippedCream = whipped;

        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        System.out.println("This coffee has " + numberOfCups + " cups, " + flavor + " flavored, and it is " + hasWhippedCream + " that it has whipped cream.");

        // TODO
        // Make this method print order details.
        // Include information stored in each variable.

    }
}
