package javaprograms.studyjava;

public class OddOccurrence {

	public static void main(String[] args) {
		 int arr[] = new int[]{ 2, 5, 3,  4, 5, 2, 4, 3, 5, 2, 4, 4, 2, 3,3,3,4,4,4,4,4, 4};
	        int n = arr.length;
	        System.out.println(getOddOccurrence(arr, n));

	}
	
	static int getOddOccurrence(int arr[], int arr_size)    {
        int max_Key = 0;
        int Max_Value = 0;       
        int i;
        for (i = 0; i < arr_size; i++) {
            int count = 0;
            for (int j = 0; j < arr_size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0){
                if(max_Key < count){
                    max_Key = count;
                    Max_Value = arr[i];
                }       
            }              
        }
        System.out.println("Value : "+Max_Value+" Max Count : "+ max_Key);       
        return Max_Value;
    }  

}
