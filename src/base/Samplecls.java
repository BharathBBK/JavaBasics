package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Samplecls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList <String> ();
		String name = "Hi Bharath kumar Bondada How Are you Bharath kumar Hi";
		
		String [] mas =name.split(" ");
		
		for (String val:mas) {
			
			list.add(val);
		}
		Collections.sort(list);
		
		final Set <String> tempset = new HashSet <String>();
		final Set <String> results = new HashSet<String>();
		
		for(String res:list) {
			
			if(!tempset.add(res)) {
				
				results.add(res);
				
			}
			
		}
		
		System.out.println(results);
		
//		for(int i = 0;i<10;i++) {
//			
//			list.add(String.valueOf(i));
//		}
//		
//        for(int i = 0;i<5;i++) {
//			
//			list.add(String.valueOf(i));
//		}
		
		
		System.out.println("input list :"+ list);
		//System.out.println("filtered duplicates: "+processList(list));
		

	}
	
	public static Set <String> processList (List  <String> listcontainingDeplicates){
		
		
		final Set <String> resultSet = new HashSet <String>();
		final Set <String> tempset = new HashSet <String>();
		
		for(String yourInt : listcontainingDeplicates) {
			
		//	System.out.println("input list :"+ tempset);
			
			if(!tempset.add(yourInt)) {
				resultSet.add(yourInt);
			}
		}
		
		return resultSet;
	} 

	public void foundduplicates() {
		
	}
}
