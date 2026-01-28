package april;

import java.util.ArrayList;

public class Main {
	static void MakeSurroundingElementsZero(int i,int j,int[][]matrix){
        //when the element is not on the boundary of matrix.means it has
        // all surrounding elements
        if(i >0 && i < matrix.length-1 && j >0 && j < matrix[i].length-1){
             matrix[i][j-1]=matrix[i][j+1]=matrix[i-1][j]=matrix[i+1][j]=0;
        }
        //when it is in the first row
        else if(i ==0){
            // when it is not the first or last element in the first row
            if(j >0 && j < matrix[i].length-1){
                 matrix[i][j+1]=matrix[i][j-1]=matrix[i+1][j]=0;
            }
            //when it is the first element of the first row
            else if(j ==0){
                 matrix[i][j+1]=matrix[i+1][j]=0;
            }
            // when it is the last element of the first row
            else{
                matrix[i][j-1]=matrix[i+1][j]=0;
            }
        }
        //when the element is present in the last row
        else{
            //element not the last or the first in the last row
            if (j >0 && j < matrix[i].length-1 ){
                matrix[i][j+1]=matrix[i-1][j]=matrix[i][j-1]=0;
            }
            //first element in the last row
            else if (j==0){
                matrix[i-1][j]=matrix[i][j+1]=0;
            }
            //last element of the last row
            else{
                matrix[i][j-1]=matrix[i-1][j]=0;
            }
        }
    }
    static void addElements(int i,int j,int[][]matrix){
        //when the element is not on the boundary of matrix.means it has
        // all surrounding elements
        if(i >0 && i < matrix.length-1 && j >0 && j < matrix[i].length-1){
            matrix[i][j] = matrix[i][j-1]+matrix[i][j+1]+matrix[i-1][j]+matrix[i+1][j];
        }
        //when it is in the first row
        else if(i ==0){
            // when it is not the first or last element in the first row
            if(j >0 && j < matrix[i].length-1){
                matrix[i][j] = matrix[i][j+1]+matrix[i][j-1]+matrix[i+1][j];
            }
            //when it is the first element of the first row
            else if(j ==0){
                matrix[i][j] = matrix[i][j+1]+matrix[i+1][j];
            }
            // when it is the last element of the first row
            else{
                matrix[i][j] = matrix[i][j-1]+matrix[i+1][j];
            }
        }
        //when the element is present in the last row
        else{
            //element not the last or the first in the last row
            if (j >0 && j < matrix[i].length-1 ){
                matrix[i][j] = matrix[i][j+1]+matrix[i-1][j]+matrix[i][j-1];
            }
            //first element in the last row
            else if (j==0){
                matrix[i][j]= matrix[i-1][j]+matrix[i][j+1];
            }
            //last element of the last row
            else{
                matrix[i][j] = matrix[i][j-1]+matrix[i-1][j];
            }
        }
    }
    static void MakeZeroes(int[][] matrix) {
        ArrayList<Integer[]> zeroElements = new ArrayList<Integer[]>();
        for (int i = 0;i < matrix.length;i++) {
            for(int j = 0;j < matrix[i].length;j++){
                //checking each element for zero value
                if(matrix[i][j] == 0){
                    addElements(i,j,matrix);
                    //store it as we haven't made the surrounding elements zero yet

                    Integer[] zeroelem = {i,j};
                    zeroElements.add(zeroelem);

                }
            }
        }
        //finally, make surrounding elements zero
        for (int i = 0;i<zeroElements.size();i++){

                MakeSurroundingElementsZero(zeroElements.get(i)[0],zeroElements.get(i)[1],matrix);

        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{2,0,4,0},
                          {5,9,7,9},
                          {2,0,8,0}};
        MakeZeroes(matrix);
        for (int i =0;i < matrix.length;i++){
            for (int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
