package SeleniumConcepts;

import com.github.javafaker.Faker;

public class JavaFakerConcept {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	
		Faker fake=new Faker();
		String username=fake.name().username();
		String password=fake.internet().password();
		System.out.println("user name is: "+username);
		System.out.println("Paasword is: "+password);
		
	}
	}

