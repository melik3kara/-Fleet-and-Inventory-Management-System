/**
* This class creates objects named Item.
* Item has weight, price, count and type
* @author Melike Kara
* @vector 10.12.23
*/
public class Item 
{
    //instance variables

    private static int id=0;
    private int itemId;
    private int weight;
    private int price;
    private int count ;
    private String type;
    String[] types = new String[4];
    

    // constructor

    public Item(int weight, int price, int count, String type)
    {
        // types of items
        
        types[0]= "Book";
        types[1]= "Television";
        types[2]= "Water";
        types[3]= "Milk";
        for(String choosenType : types)
        {
            if(type.equals(choosenType))
            {
                this.type=choosenType;
            }
        }
        this.weight = weight;
        this.price = price;
        this.count = count;
        id++;
        this.itemId = id;
    }

    // getter methods

    public int getItemId()
    {
        return this.itemId;
    }
    public int getWeight()
    {
        return this.weight;
    }
    public int getPrice()
    {
        return this.price;
    }
    public int getCount()
    {
        return this.count;
    }
    public String getType()
    {
        return this.type;
    }
}
