package ArrayEx;

public class Array6reason {

	public static void main(String[] args) {
		
		String[][] matrix = { {"T-Rex cage", "StegoSaurs cage","Velociraptor cage","Triceratops cage"},{"Cafe","Toilet","Food","Lost prorerty"}};
		
		 
		String[][] seatMap = { {"seat1",null,"seat2","seat3"},{"seat4",null,"seat5",null}};
		
		
		
		for(int i = 0; i < seatMap.length; i++) {
			System.out.print("Section " + (i +1) +":");
			for(int j = 0; j < seatMap[i].length; j++) {
				System.out.print(seatMap[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
				
		

	}

}
