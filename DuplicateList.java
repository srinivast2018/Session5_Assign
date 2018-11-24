//Build any collection containing duplicates.Create its copy with all duplicates removed.
package mypackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class DuplicateList {
		//Declaration of main method
	public static void main(String[] args) {
	
		//Create an ArrayList of type String
		ArrayList<String> colors= new ArrayList<String>();
		
		//Add elements to ArrayList
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Magenta");
		colors.add("White");
		colors.add("Black");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Black");
		
		System.out.println("The list of colors with duplicates");
		System.out.println("*************************************");
		//for(String color:colors)
			//System.out.println(color);
		
		//Iterating the ArrayList elements using iterator
		Iterator itr=colors.iterator();
		while(itr.hasNext())
		{
			Object element=itr.next();
			System.out.println(element);
		}
		
		//Converting to HashSet
		Collection<String> hset=new HashSet<String>(colors);
		
		System.out.println();
		System.out.println();
		
		System.out.println("The list of colors after removing duplicates");
		System.out.println("********************************************");
		
		//Iterating the HashSet elements using iterator
		Iterator itr2=hset.iterator();
		while(itr2.hasNext())
		{
			Object element=itr2.next();
			System.out.println(element);
		}
		
		
	}

}
