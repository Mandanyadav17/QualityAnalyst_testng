 package corejavabasics;

public class Variabledec_arraydec {

	public static void main(String[] args) {
		// Declarations of variables
		
		  int intvr=8;
		 String stringvar ="Mndan yadav";
		 char charvar='r';
		 double doubblevar= 98.89;
		 float floatvar = 7.7f;
		 boolean bollvar=true;
		 
		 System.out.print("My name is"+stringvar);
		 
		 //arrays 

		 
 //shortcut for array
		 // datatype[] obj={values,values}
		 
		 int[] arrshort=  {2,94,49,40,570,598,57,};
		 System.out.print("My  array is"+arrshort[4]);
		 
		// how many values are there in this array
	System.out.print("My  array lenght is"+arrshort.length);
	
	//how to print values via loop
	//You can loop through the array elements with 
	//the for loop, and use the length property to specify how many times the loop should run.
	String[] stryarr= {"nidhi","piyush","mandan","mamma","family"};
	for(int i=0;i<stryarr.length;i++) {
		System.out.println(stryarr[i]);
		
		//for-each" loop, which is used exclusively to loop through elements in arrays:
		// for(dataType item : array) { ... }
		String[] stryarr2= {"nidhi","piyush","mandan","mamma","newmemberanita"};
		for(String ii : stryarr2) {
			System.out.println("this is for each"+ii);

		}
		
		//Emhanced for loop
		
		//for(datatype variable:array name)
		
		String[] life= {"School", "college","naukri"};
        for(String dog:life){
        	
        	System.out.println("this is for life " +"" +dog);	
      }
                }
		}
		
	
	}
	
	

