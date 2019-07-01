public class E12_AmericanFlag {

	public static void main(String[] args) {
		int rows, columns, i,j;
		
		// nested loop of 15 rows and 46 columns to create the size of the flag
		for (i =1; i <16; i++) {
			
			for(j=1; j<35; j++) {
				
			/* odd rows under 10 to have 6 stars with the first column starting with a star	then space then star 
			 * This will continue until the 13th column which will switch to a pattern of equal signs and empty spaces "= "
			*/	
				if(i<10 && i%2!=0 && j<7) {
					System.out.print("*  ");
					}
					else if (i<10 && i%2 ==0 && j<6) {
						System.out.print(" * ");
			}
					else if (i<10 && i%2 ==0 && j>8 && j<32) {
						System.out.print(" =");
			}
				// putting a space in particular column will even out the equal signs starting from column 7 which is an empty space
					else if (i<10 && i%2 ==0 && j==6) {
						System.out.print("  ");
			}
					else if(i<10  && j>8 && j<32) {
					System.out.print("= ");
					}
					// from row 11 onward all the columns will have the equal sign and space pattern
					else if (i>=10 && j<=32) {
						System.out.print("= ");
			}
			
				
			}
			System.out.print("\n");
		}

	}

}
