package package1;

public class ArrayMethodArguments {
	
	public static void printArray(int[] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new int[] {3,4,5,7,9});
		

	}

}
