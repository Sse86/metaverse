package ArrayEx;

public class Arrayclass1 {

	public static void main(String[] args) {
		String[ ] names = {"Maria", "Fatiha","Pradeepa","Sasrah"};
		int index =0;
		
		if(index >=0 && index <names.length) {
			
			System.out.println("Element at index" + index+ ":" +names[index]);
		}else {
			System.out.println("Invalid index: "+index);
		}
		int[] results = {10, 20,30,40,50};
		for(int i=0;i< results.length;i++) {
			System.out.println("Element at "+ i+ ":" +results[i]);
		}
	}

}
