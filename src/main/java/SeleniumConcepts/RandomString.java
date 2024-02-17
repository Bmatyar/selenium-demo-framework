package SeleniumConcepts;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			//first Approach
			System.out.println(Math.random());
			
			//Second Approach
			Random rand = new Random();
			int random_int = rand.nextInt(20);
			System.out.println(random_int);
			double randon_double =rand.nextDouble();
			System.out.println(randon_double);
			
			//Third Approach - Commons Apache -Lang API
			String randString= RandomStringUtils.random(7, true, true);
			System.out.println(randString);
			
			
			
	}

}
