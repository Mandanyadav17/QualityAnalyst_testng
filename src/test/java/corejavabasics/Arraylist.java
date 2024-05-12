package corejavabasics;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("67");
		list.add("8");
	//System.out.println(list.get(3));
		//list.remove(0);
		list.add("test23");
		list.add("ftfyg");
		
		//for retrive the vlaues of srray list
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//EMhsnced for lop
		for( String obj: list )
		{
			System.out.println(obj);
			
		}
		System.out.println("*******");
		//for item is present in arraylist
		System.out.println(list.contains("fhbjkf"));
	}
}



		
