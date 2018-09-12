package day53.collectionframework.list;

import java.util.ArrayList;

class Thing
{
    public int value;  
    int y;

    public Thing (int x, int y)
    {
        this.value = x;
        this.y = y;
    }

   @Override
    public boolean equals(Object object)
    {
        boolean sameSame = false;

        if (object != null && object instanceof Thing)
        {
            sameSame = this.value == ((Thing) object).value;
        }

        return sameSame;
    }
}

public class ALContainsDemo{

	public static void main(String[] args) {
		ArrayList<Thing> basket = new ArrayList<Thing>();  
		Thing thing = new Thing(100, 50); 
		Thing thing2 = new Thing(10, 20);
		basket.add(thing);  
		basket.add(thing2);
		Thing another = new Thing(100, 30);  
		
		System.out.println(basket.contains(another)); // true or false?
	}

}