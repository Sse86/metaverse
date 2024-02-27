package ArrayEx;
import java.util.Arrays;
public class Array5reason {

	public static void main(String[] args) {
		
		double[] ages = {28,34,21,31,39};
		double total =0;
	   for(int i=0;i<ages.length;i++) {
		   
		   total += ages[i];
		   
		   
		   
	   }
	   double average = total/ ages.length;
	   System.out.println("공룡의 평균나이: "+average);

	}

}
