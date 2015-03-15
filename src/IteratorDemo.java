/** Iterators are useful for when you need to cycle through the elements of a collection.
 */

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add(new Integer(0));
		al.add(new Double(1.1));
		al.add(new Boolean(true));
		al.add(Boolean.FALSE);
		al.add("Final String".toLowerCase());
		
		System.out.print("Original content of al: ");		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext()) {
			litr.set("%" + litr.next());
		}
		
		System.out.print("\nModified content of al: ");
		itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
	    System.out.print("\nModified list backwards: ");
	    while(litr.hasPrevious()) {
	    	System.out.print(litr.previous() + " ");
	    }
	}
}