package april;

/**
 * 
 * @author Garun Mishra
 * @Date 15-Nov-2022
 *
 */

public class TestMatrixCountSurroundingExample {

	final static int Row = 6;
    final static int Col = 6;
    static int r[] = {0, 0, 1, -1};
    static int c[] = {1, -1, 0, 0};
    
    public static void main(String ar[]) {
		/*
		 * int [][] arrayMatrix= new int [6][6];
		 * System.out.println("Enter the element "); int element =0; Scanner sc = new
		 * Scanner(System.in ); for(int i=0; i<=5 ; i++) { for(int j=0; j <= 5; j++ ) {
		 * element = sc.nextInt(); arrayMatrix[i][j] = element; } }
		 */
    	
    	int[][] arrayMatrix = {
				{0, 1, 0, 1, 0, 1},
                {1, 1, 1, 1, 0, 1},
                {1, 1, 0, 1, 0, 1},               
                {1, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 0, 1}
		};
    	
    	int Row = 6;
    	int Col = 6;
    	
    	 for (int i = 0; i < Col; i++) {
             if (arrayMatrix[0][i] == 0) {
                 checkCondition(0, i, arrayMatrix);
             }
         }
         for (int i = 0; i < Col; i++) {
             if (arrayMatrix[Row - 1][i] == 0) {
            	 checkCondition(Row - 1, i, arrayMatrix);
             }
         }
         for (int i = 0; i < Row; i++) {
             if (arrayMatrix[i][0] == 0) {
            	 checkCondition(i, 0, arrayMatrix);
             }
         }
         for (int i = 0; i < Row; i++) {
             if (arrayMatrix[i][Col - 1] == 0) {
            	 checkCondition(i, Col - 1, arrayMatrix);
             }
         }
    	
         // count all zeros which are surrounded by 1
	        int result = 0;
	        for (int i = 0; i < Row; i++) {
	            for (int j = 0; j < Col; j++) {
	                if (arrayMatrix[i][j] == 0) {
	                    result++;
	                }
	            }
	        }
	     
    	System.out.println("Number of zero sorrounded by 1 ==>> "+result);
    	
    }

	private static void checkCondition(int x, int y, int[][] arrayMatrix) {
		        // make it's visited
		arrayMatrix[x][y] = 1;
		        for (int k = 0; k < 4; k++) {
		            if (checkSafeCondition(x + r[k], y + c[k], arrayMatrix)) {
		            	checkCondition(x + r[k], y + c[k], arrayMatrix);
		            }
		        }
		
	}

	private static boolean checkSafeCondition(int x, int y, int M[][]) {
	        if (x >= 0 && x <Row && y >= 0
	                && y < Col && M[x][y] == 0) {
	            return true;
	        }
	        return false;
	    }
	
	
}
