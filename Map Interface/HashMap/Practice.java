import java.util.*;
class Practice
{
	public static void main(String arg[])
	{
		HashMap h=new HashMap();
		h.put(101,"ram");
		h.put(104,"ramji");
		h.put(103,"sita");
		h.put(102,"sitaji");
		// System.out.println(h);
		h.forEach((k,v)->System.out.println(k));
		h.forEach((k,v)->System.out.println(v));
		
	}
}

// hashmap						hashset
// 1 implements map			implements set
// 2 internal ds is 			internal ds is hashmap	
  // hashtable
// 3 store element is      	store single objects
  // key value pair
// 4 single null key 			null value not allowed
  // allowed
// 5 duplicate value			duplicate not possible
  // insertion is possible
// 6 fast 						slow
// 7 put method to add data	add method to add data