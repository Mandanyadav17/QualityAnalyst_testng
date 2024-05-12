package corejavabasics;

public class Methods_callaswell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods_callaswell d =new Methods_callaswell();
		d.getdataby();
		int name = d.getdaabyint();
		System.out.println(name);
		callmethodsfroanotherclass d8=new callmethodsfroanotherclass();
		d8.callbyanotehrclassuser();
		getdataby();
		


}
	//metods are declared outside the main method and we use void if we dnt want
	//to return anything if we want to return anything please use integer and 
	//string as per the requirements
	public static void getdataby() {
		System.out.println("callby main method");
	}
	public int getdaabyint() {
		System.out.println("with int  return type");
		return 0;
	}
	}
	


