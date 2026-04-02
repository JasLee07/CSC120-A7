/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, 
        int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe.");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces < size || this.nSugarPackets < nSugarPackets 
            || this.nCreams < nCreams || this.nCups < 1 ){
        restock(500, 300, 150, 70);
        }
        System.out.println("One latte coming up!");
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("Here is your latte!");
        
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
        System.out.println("Items stocked");
    }

    public static void main(String[] args) {
        Cafe DashCafe = new Cafe("Cafe le Dash", "123 B Street", 2, 
        300, 300, 200, 70);
        System.out.println("Welcome! What can I get for you?");
        DashCafe.sellCoffee(16, 7, 4);
        DashCafe.sellCoffee(20, 8, 5);
        DashCafe.sellCoffee(12, 5, 3);
        System.out.println("Enjoy your day!");
    }   
}
