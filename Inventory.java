import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class creates an object named Inventory.
 * Inventory holds item's list in it.
 * @author Melike Kara
 * @vector 10.12.23
 */
public class Inventory 
{
    ArrayList<Item>itemList = new ArrayList<Item>();

    /**
     * This methods fill inventory.
     * It creates new values in the itemList ArrayList.
     */
    public void fillInventory()
    {
        boolean control = true;
        while(control)
        {
            String itemName = "";
            int[] num = new int[3];
            int i = 0;
            System.out.println("Type the number of the item you want to add to the inventory" +
            "\n1) Book, 2) Television, 3) Water, 4) Milk, 5) Exit");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            in.nextLine();

            if(choice==1|| choice==2||choice==3||choice==4)
            {
                if(choice==1)
                {
                    itemName = "Book";
                }
                if(choice==2)
                {
                    itemName = "Television";
                }
                if(choice==3)
                {
                    itemName = "Water";
                }
                if(choice==4)
                {
                    itemName = "Milk";
                }
                
                System.out.println("Enter the weight, price, and count for the " + itemName + ". Use a comma to separate each value.");
                String nums = in.nextLine();
                String[] numSplit = nums.split(",");
                for (String number : numSplit) 
                {
                    num[i] = Integer.parseInt(number.trim());
                    //num[i] = Integer.valueOf(number);
                    i++;
                }
                Item item = new Item(num[0], num[1], num[2], itemName); // first value is weight, second is price, third is count.
                itemList.add(item);
            }
            
            if(choice==5)
            {
                control = false;
            }
        }
    }

    // getter methods

    public Item getItem(ArrayList<Item> itemList, int no)
    {
        return itemList.get(no);
    }

    public ArrayList<Item> getItemList()
    {
        return this.itemList;
    }

    /**
     * this method prints features of each item in the item list.
     */
    
    public void listInventory()
    {
        int i = 0;
        for(Item eachItem : itemList)
        {
            i++;
            System.out.println("Item " + i + ":");
            System.out.println("Type: " + eachItem.getType());
            System.out.println("Count: " + eachItem.getCount());
            System.out.println("Weight: " + eachItem.getWeight());
            System.out.println("Price: " + eachItem.getPrice());
            System.out.println();
        }
    }

    public int getTotalPrice()
    {
        int totalPrice = 0;
        for(Item eachItem : itemList)
        {
            totalPrice += (eachItem.getPrice())*(eachItem.getCount());
        }
        return totalPrice;
    }

    public int getTotalWeight()
    {
        int totalWeight = 0;
        for(Item eachItem : itemList)
        {
            totalWeight += (eachItem.getWeight())*(eachItem.getCount());
        }
        return totalWeight;
    }
}
