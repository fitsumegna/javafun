package hfj;

public class PhraseOMatic {

	public static void main(String[] args) {
		
		
		// Make three sets of words to choose from. Add your own
		String[] wordListOne = {"24/7", "Multi-tier", "30,000 foot", "B-to-B", "win-win", "front and", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "netowrked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelareated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "miision"};
		
		// Find out the number of words in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// Generate three random numbers
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);
		
		// New build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		// Print the new phrase
		System.out.println("What we need is a " + phrase);
		
		// Feeling lucky?
		numberDraw(1);
		
	}
	
		public static void numberDraw(int selectedNumber) {
			
			// Prepare a set of integers
			int[] numberList = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			
			// Size of the array
			int numberListLength = numberList.length;
			
			// Generate a random index number
			int randomNumber = (int)(Math.random() * numberListLength);

			// Display the lucky number
			System.out.println("Lucky number = " + numberList[randomNumber]);
			
			
			if(selectedNumber == numberList[randomNumber])
				System.out.println("Bingo");
			else
				System.out.println("Sorry");
		}

}
