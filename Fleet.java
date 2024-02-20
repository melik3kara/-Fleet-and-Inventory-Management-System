import java.util.ArrayList;
/**
 * This class creates an object named Fleet.
 * Each fleet has several vehicles in it.
 * @author Melike Kara
 * @vector 10.12.23
 */
public class Fleet 
{
    ArrayList <Vehicle> vehicles = new ArrayList <Vehicle> ();

    public void createShipment(Inventory inventory)
    {   
        if(inventory.getItemList().size()>0) // controls whether there is any item or not.
        {
            Vehicle vehicle = new Vehicle(100, 100, 0, null);
            vehicles.add(vehicle);
            for(int i = 0; i< inventory.getItemList().size(); i++)
            {

                Item item =  inventory.getItem(inventory.getItemList(), i);
                if(item.getWeight() * item.getCount() > 100)
                {
                    System.out.println("Weight capasity is exceed!");
                }
                else
                {
                    if(vehicle.getCurrentWeight() + item.getWeight()*item.getCount() < 100)
                    {
                        int addedWeight = item.getWeight()*item.getCount();
                        vehicle.setWeight(addedWeight);
                        vehicle.getItems().add(item);
                    }
                    else
                    {
                        vehicle = new Vehicle(100, 100, 0, null);
                        vehicles.add(vehicle);
                        int addedWeight = item.getWeight()*item.getCount();
                        vehicle.setWeight(addedWeight);
                        vehicle.getItems().add(item);
                    }  
                }
            }
        }
        else
        {
            System.out.println("There is no item to transport!");
        }
    }

    /**
     * This method prints list of vehicles and items in the each vehicle
     */

    public void listFleet()
    {
        int counter = 0;
        for (int i = 0; i < this.vehicles.size(); i++) 
        {
            System.out.println();
            System.out.println("Vehicle " + (i+1) + ":\n");
            System.out.println("Remaining capasity: " + (vehicles.get(i).getWeightCapasity()-vehicles.get(i).getCurrentWeight()));
            System.out.println("Shipping Cost: " + vehicles.get(i).getCost());
            System.out.println("Current Weight: " + vehicles.get(i).getCurrentWeight() );
            System.out.println("Items:");

            for (int j = 0; j < vehicles.get(i).getItems().size(); j++) 
            {
                counter ++;
                System.out.println();
                System.out.println("Item " + (counter) + ":");
                System.out.println("Type: " + vehicles.get(i).getItem(j).getType());
                System.out.println("Count: " + vehicles.get(i).getItem(j).getCount());
                System.out.println("Weight: " + vehicles.get(i).getItem(j).getWeight());
                System.out.println("Price: " + vehicles.get(i).getItem(j).getPrice());
            }
        }
    }
}
