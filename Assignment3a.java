/*
 * Fibonacci Series
 */
public class Assignment3a {

	public static void main(String[] args) {
		String series = "0";
		String[] series1 = null;
		String value;
		int j = 0;
		int k = 0;
		int l = 0;

		for (int i=0; i<20; i++){
			if(i == 0){
				series = "0,1";
			}
			else{
				series1 = series.split(",");
				j=Integer.parseInt(series1[i-1]);
				k=Integer.parseInt(series1[i]);
				l=j+k;
				value=String.valueOf(l);
				series=series.concat(",").concat(value);
			}
		}
		System.out.println("The series is "+series);

	}

}
