
public class Assignment2c {

	/**
	 * nested if else
	 */
	public static void main(String[] args) {
		String test1 = "3";
		String test2 = "2";
		
		if(test1.equals("5")){
			if(test2.equals("3")){
				System.out.println("Hi, test1 is 5 and test2 is 3");
			}
			else{
				System.out.println("Hi, test1 is 5 and test2 is some value other than 3");
			}
		}
		else if(test1.equals("4")){
			System.out.println("Hi, test1 is 4");
		}
		else if(test1.equals("3")){
			if(test2.equals("3")){
				System.out.println("Hi, test1 is 3 and test2 is 3");
			}
			else if(test2.equals("2")){
				System.out.println("Hi, test1 is 3 and test2 is 2");
			}
		}
		else{
			System.out.println("Hi, test1 is some value other than 5,4,3");
		}

	}

}
