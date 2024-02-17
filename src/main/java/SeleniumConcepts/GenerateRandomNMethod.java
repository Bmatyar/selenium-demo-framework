package SeleniumConcepts;

public class GenerateRandomNMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
		int l=10;
		 StringBuilder s = new StringBuilder(l);

		 int i;

		 for ( i=0; i<l; i++) {

		   //generating a random number using math.random()

		   int ch = (int)(AlphaNumericStr.length() * Math.random());

		   //adding Random character one by one at the end of s

		   s.append(AlphaNumericStr.charAt(ch));

		  }

		    System.out.println(s.toString());

		 }
		
		
	}


