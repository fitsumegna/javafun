package hfj;

public class BeerSong {
	public static void main ( String[] args ) {
		int beerNum = 99;
		String word = " bottles ";
		try {
		while ( beerNum > 0 ) {
			
			if ( beerNum == 1 ) {
				word = " bottle ";
			}
				System.out.println ( beerNum  + word + "of beer on the wall " );
				// System.out.println ( beerNum  + word + "of beer" );
				System.out.println ( "Take one down" );
				System.out.println ( "Pass it around" );
				beerNum = beerNum - 1;
				
				
			} // end outer if condition		
			
			if ( beerNum > 1) {
					System.out.println ( beerNum + " " + word + " of beer on the wall " );
			} 
			
			else {		
				System.out.println ( " No more bottles of beer on the wall " );
		} // end while loop
		}
		catch(NumberFormatException e) {
			System.out.println( e.getMessage());
		}
	} // end main method
} // end class BeerSong
