package table;

import java.util.ArrayList;
import java.util.List;

public class SurroundingElements {
	private static int[][] directions = new int[][]{{-1,-1}, {-1,0}, {-1,1},  {0,1}, {1,1},  {1,0},  {1,-1},  {0, -1}};
	public static void main(String[] args) {
		int array [][] = 				{
										 {1,2,3,4,5,6},
										 {8,9,7,5,2,6},
										 {1,6,8,7,5,8},
										 {2,7,9,5,4,3},
										 {4,7,5,2,1,3}
										};

		
										/*
										 * for (int i = 0; i < array.length; i++) { for (int j = 0; j < array[i].length;
										 * j++) { for (int x = Math.max(0, i - 1); x <= Math.min(i + 1, array.length);
										 * x++) { for (int y = Math.max(0, j - 1); y <= Math.min(j + 1,
										 * array[i].length); y++) { if (x >= 0 && y >= 0 && x < array.length && y <
										 * array[i].length) { if(x!=i || y!=j){ System.out.print(array[x][y] + " "); } }
										 * } } System.out.println("\n"); } }
										 */
		
		List<Integer> res = getSurroundings( array,  array.length,  array[0].length);
		System.out.println("The size of result  : "+res.size());
		res.stream().forEach(r -> {
			System.out.println(r +" ");
		});
		
		
	}
	
	static List<Integer> getSurroundings(int[][] matrix, int x, int y){
	    List<Integer> res = new ArrayList<Integer>();
	    for (int[] direction : directions) {
	        int cx = x + direction[0];
	        int cy = y + direction[1];
	        if(cy >=0 && cy < matrix.length)
	            if(cx >= 0 && cx < matrix[cy].length)
	                res.add(matrix[cy][cx]);
	    }
	    return res;
	}

}
