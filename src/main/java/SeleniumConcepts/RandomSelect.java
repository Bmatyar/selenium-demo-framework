package SeleniumConcepts;

import java.util.Random;

public class RandomSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"A", "B", "C", "D"};
        Random random = new Random();

        // randomly selects an index from the arr
        int select = random.nextInt(arr.length); 

        // prints out the value at the randomly selected index
        System.out.println("Random String selected: " + arr[select]); 
	}

}
