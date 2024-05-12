package corejavabasics;

public class String_java {

	public static void main(String[] args) {
//		//String is an object //lateral if object is different but values are same it will save one of them only.
		
	String s="test string";
	String s2="test string";
		
		//new keyword
	String obj =new String();
		String obj2="test new string value";
	String[] spilistringarrayobject=obj2.split("new");
		//Makeing array for prientlint the values of strings
		//System.out.println(spilistringarrayobject[0]);
		//System.out.println(spilistringarrayobject[1]);
		//System.out.println(spilistringarrayobject[1].trim());
		
//		//how to print reverse value
	for(int i=obj2.length()-1;i>=0;i--) {
			
			System.out.println(obj2.charAt(i));
		}
		System.out.println("test");
	}
}

//   String[] name = {"Sarvesh", "Singh", "Selenium"}
//		
//	for(int i=0; i<name.length; i++)
//	{
//			    System.out.println(name);
	//}}
//		String[] name = {"Sarvesh", "Singh", "Selenium"};
//
//		for (int i = 0; i < name.length; i++) {
//		    System.out.println(name[i]);
//		}
//	}
//}
		
		

		
		
	


