package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class CarsArray {

	public static void main(String[] args)
	{
		System.out.println("hello");
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Ford");
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Honda");
		System.out.println(cars);
		 
		//Get method
		System.out.println("Get:"+cars.get(2));
		//Set method
		cars.set(1,"Toyota");
		System.out.println(cars);
		
		//Remove Method
		cars.remove(3);
		System.out.println(cars);
		
		//Size of array
		System.out.println(cars.size());
		
		//Sort Array
		Collections.sort(cars);
		
		
		//For Each
		for(String i:cars)
		{
		System.out.println(i);
		}
		
		//For Loop
		for(int i = 0; i<cars.size();i++ )
		{
			System.out.println("For Loop:"+cars.get(i));
		}
	}

}
