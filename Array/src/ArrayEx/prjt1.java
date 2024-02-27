package ArrayEx;

public class prjt1 {

	public static void main(String[] args) {
		String[] dinoNames= {"dino1", "dino2"};
		int[] dinoAges = {5,6};
		String[] dinoSpecies = {"species1","species2"};
		int[] dinoEnclosures = {1,2};
		int[] dinoWeights = { 1000, 1500};
		
		int ageSum = 0;
		int weightSum = 0;
		
		for(int i = 0; i < 2; i++) {
			System.out.print("section" + i + " ");
			System.out.println(dinoNames[i] + " " + dinoAges[i] + " " + dinoSpecies[i] + " " + dinoEnclosures[i]);
		}
		
		
		for(int j = 0; j < 2; j++) {
			ageSum += dinoAges[j];
			weightSum += dinoWeights[j];
		}
		
		System.out.println("평군 나이 " + ageSum/2);
		System.out.println("평군 무게 " + weightSum/2);

	}

}
