package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmap {
	public static void main(String [] args)
	{
		HashMap <String,Integer> map=new HashMap<String,Integer>();
		ArrayList al=new ArrayList();
				al.add("Vipul");
				al.add("Vipin");
				al.add("Aman");
				al.add("Nishek");
				al.add("Vipul");
				al.add("Nishek");
	//	System.out.println(al);	
		for(int i=0;i<al.size();i++) {
			if(map.containsKey(al.get(i))) {
				int value=map.get(al.get(i));
				value++;
				map.put((String) al.get(i), value);
			}
			else {
				map.put((String) al.get(i), 1);
			}
			
		}
				
		System.out.print(map);		
				
				
				
	}

}
