import java.util.Scanner;
/*
*This menu makes some shipments
*We can control our codes running in here
*@author Melike Kara
*/
public class Menu {
    public static void main(String[] args){
        System.out.println("Welcome to the inventory management system!");
        
        //defining variables
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);
        String newLine;
        Inventory inventory = null;
        
        while (choice != 3){
            System.out.println("Please select an option:");
            System.out.println("1. Create a new inventory");
            System.out.println("2. Create a new shipment");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");


            choice = keyboard.nextInt();
            newLine = keyboard.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Creating a new inventory");
                    inventory = new Inventory();
                    inventory.fillInventory();
                    
                    System.out.println("Inventory created. Details: -----------------");
                    inventory.listInventory();
    
                    System.out.println("Total price: " + inventory.getTotalPrice());
                    System.out.println("Total weight: " + inventory.getTotalWeight());
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    //check if inventory exists
                    if (inventory == null){
                        System.out.println("Please create an inventory first");
                        break;
                    }
                    System.out.println("Creating a new shipment");

                    //create a new fleet and create a shipment
                    Fleet fleet = new Fleet();
                    fleet.createShipment(inventory);

                    //display the fleet
                    System.out.println("Fleet created. Details: -----------------");
                    fleet.listFleet();
                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

}
