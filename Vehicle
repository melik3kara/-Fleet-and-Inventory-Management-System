import java.util.ArrayList;
/**
 * Creates an object named Vehicle
 * Vehicle has items in it
 * @author Melike Kara
 * @vector 10.12.23
 */
public class Vehicle 
{
    //instance variables

    private int id = 0;
    private int vehicleId;
    private int weightCapacity;
    private int cost;
    private int currentWeight;
    private ArrayList<Item> items;

    // constructor method

    public Vehicle(int weightCapacity, int cost, int currentWeight, ArrayList<Item> items)
    {
        id ++;
        vehicleId = id;
        this.weightCapacity = weightCapacity;
        this.cost = cost;
        this.currentWeight = currentWeight;

        this.items = new ArrayList<Item>();
    }

    // setter methods

    public int setWeight(int weight)
    {
        this.currentWeight += weight; 
        return currentWeight;
    }

    // getter methods

    public int getVehicleId()
    {
        return this.vehicleId;
    }
    public int getWeightCapasity()
    {
        return this.weightCapacity;
    }
    public int getCost()
    {
        return this.cost;
    }
    public int getCurrentWeight()
    {
        return this.currentWeight;
    }
    public ArrayList<Item> getItems()
    {
        return this.items;
    }
    public int getItemNumber()
    {
        return items.size();
    }
    public Item getItem(int num)
    {
        return items.get(num);
    }
}
