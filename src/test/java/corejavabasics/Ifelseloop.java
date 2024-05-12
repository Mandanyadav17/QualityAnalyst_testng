package corejavabasics;

public class Ifelseloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {2,7,89,66,90,76,77,00,4};
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2 == 0) {
				 System.out.println(numbers[i]);
			}
			else {
				System.out.println(numbers[i] +"is not multiple of 2");
			}
		}
		}

	}


