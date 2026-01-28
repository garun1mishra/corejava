package april.output;

public class MainClass {

	public static void main(String[] args) {
       int array [] = new int[]{2,3,3,5,6,8,9};
       int len = array.length;
	   int check [] = new int [array[len - 1] + 1];
		for(int i=0; i<len ; i++) check[array[i]] = 1;
		
		for(int i=array[0]; i <= array[len - 1]; i++) {
			if(check[i] == 0) System.out.println(i + "  ");

	}
	}
}
