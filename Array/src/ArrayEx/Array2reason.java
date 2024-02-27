package ArrayEx;
import java.util.Arrays;
public class Array2reason {

	public static void main(String[] args) {
		String[] dinoNames = {"T-Rex","Brachiosaurus","Velociraptor","Stegosaurus","Triceratops"};
		int[] dinoWeights = { 8000,14000,3000,6000,10000};
		
		int heviest = 8000;
		int index = 0;
		
		for(int i = 0; i < dinoWeights.length; i++) {
			if(dinoWeights[i] > heviest) {
				heviest = dinoWeights[i];
				index = i;
			}
		}
		
		System.out.println(dinoNames[index] + " is the heavies dinasaur and it's weight is "  + heviest);
		
		
	}

}
