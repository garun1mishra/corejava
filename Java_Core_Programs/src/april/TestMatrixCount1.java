package april;

import java.util.Scanner;

public class TestMatrixCount1 {

	 final static int Row = 4;
	    final static int Col = 5;
	    static int r[] = {0, 0, 1, -1};
	    static int c[] = {1, -1, 0, 0};
	 
	    static boolean isSafe(int x, int y, int M[][]) {
	        if (x >= 0 && x <Row && y >= 0
	                && y < Col && M[x][y] == 0) {
	            return true;
	        }
	        return false;
	    }
	 
	// DFS function to mark all reachable cells from
	// (x, y)
	    static void DFS(int x, int y, int M[][]) {
	        // make it's visited
	        M[x][y] = 1;
	        for (int k = 0; k < 4; k++) {
	            if (isSafe(x + r[k], y + c[k], M)) {
	                DFS(x + r[k], y + c[k], M);
	            }
	        }
	    }
	 
	// function return count of 0's which are surrounded by 1
	    static int CountAllZero(int M[][]) {
	        // first we remove all zeros which are not
	        // surrounded by 1 that means we only remove
	        // those zeros which are reachable from
	        // any boundary of given matrix.
	        for (int i = 0; i < Col; i++) {
	            if (M[0][i] == 0) {
	                DFS(0, i, M);
	            }
	        }
	        for (int i = 0; i < Col; i++) {
	            if (M[Row - 1][i] == 0) {
	                DFS(Row - 1, i, M);
	            }
	        }
	        for (int i = 0; i < Row; i++) {
	            if (M[i][0] == 0) {
	                DFS(i, 0, M);
	            }
	        }
	        for (int i = 0; i < Row; i++) {
	            if (M[i][Col - 1] == 0) {
	                DFS(i, Col - 1, M);
	            }
	        }
	 
	        // count all zeros which are surrounded by 1
	        int result = 0;
	        for (int i = 0; i < Row; i++) {
	            for (int j = 0; j < Col; j++) {
	                if (M[i][j] == 0) {
	                    result++;
	                }
	            }
	        }
	        return result;
	    }
	
	public static void main(String[] args) {
		int[][] arrayMatrix = {
				{0, 1, 0, 1, 0, 1},
                {1, 1, 1, 1, 0, 1},
                {1, 1, 0, 1, 0, 1},               
                {1, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 0, 1}
		};
		 System.out.print(CountAllZero(arrayMatrix));
int countZero =0;
		for(int i=0; i<= arrayMatrix.length -1  ; i++) {
			for(int j=0; j <= arrayMatrix.length -1 ; j++ ) {
				if(arrayMatrix[i][j] == 0 ) {
					if(i==0 && j==0) {
						if(arrayMatrix[i][j] != 0 && arrayMatrix[i][j+1] != 0) {
							countZero++;
						}
					}else {
						if(arrayMatrix[i][j-1] == 1 && arrayMatrix[i][j+1] == 1) {
							deceraseCounter(countZero, arrayMatrix, i, j);
							countZero++;
						}
					}
					}
				}
			}
		}
	private static void deceraseCounter(int countZero, int[][] arrayMatrix, int i, int j) {
		for(int k=0; k< arrayMatrix.length -1  ; k++) {
			for(int l= 0; l < arrayMatrix.length ; l++ ) {
				int tempplusrow = j+1, tempminusrow =j-1;	
				int temppluscol = i+1, tempminuscol =i-1;	
				if(k==tempminuscol ) {
								
					if(arrayMatrix[k][tempminusrow] == 0 || arrayMatrix[k][tempplusrow] == 0 || arrayMatrix[k][l] == 0 ) {
						countZero--;
					}
				}
				if(k==temppluscol ) {
					
					if(arrayMatrix[k][tempminusrow] == 0 || arrayMatrix[k][tempplusrow] == 0 || arrayMatrix[k][l] == 0 ) {
						countZero--;
					}
				}
			
			}
			
		}	
		
	}

}
