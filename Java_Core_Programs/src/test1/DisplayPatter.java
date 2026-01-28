package test1;

/**
 * 
 * @author Garun Mishra
 * @Date
 * @Pattern 1 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
 * 
 * @Pattern2 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5
 * 
 * @Pattern3 -- Pascal Triangle 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1
 * 
 * @Pattern4 1 212 32123 4321234 32123 212 1
 * 
 * @Pattern5 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
 * 
 * @Pattern6 -- Decendng order 5 5 4 5 4 3 5 4 3 2 5 4 3 2 1
 * 
 * @Pattern7 -- Right Triangle 1 2 1 3 2 1 4 3 2 1 5 4 3 2 1
 * 
 * 
 * 
 */

public class DisplayPatter {

	public static void main(String[] args) {
		int n = 5;
//		patter1(n);
//		System.out.println();
//		patter2(n);
//		System.out.println("Pascal Triangle");
//		patter3(n);
//		System.out.println("Diamond Pattern");
//		patter4(n);
//		System.out.println();
//		patter5(n);
//		System.out.println();
//		patter6(n);
//		System.out.println();
//		patter7(n);
//		System.out.println();
//		System.out.println("Binary Pattern");
//		System.out.println();
//		patter8(n);
//		System.out.println();
		patter9(n);
		

	}

	private static void patter8(int rows) {
		for (int i = 1; i <= rows; i++) 
        {
            int num;
              
            if(i%2 == 0)  {
                num = 0;                  
                for (int j = 1; j <= rows; j++)   {
                    System.out.print(num);                      
                    num = (num == 0)? 1 : 0;
                }
            } else {
                num = 1;                  
                for (int j = 1; j <= rows; j++) {
                    System.out.print(num);                      
                    num = (num == 0)? 1 : 0;
                }
            }
              
            System.out.println();
        }
		
	}

	private static void patter7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

	private static void patter6(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	private static void patter5(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

	private static void patter4(int num) {
		for (int i = 1; i <= num; i++) {
			int n = num;

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}

		for (int i = num-1; i >= 1; i--) {
			int n = num -1;

			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}

			System.out.println();
		}

	}

	private static void patter3(int n) {

		System.out.println();
		for (int i = 0; i < n; i++) {
			int number = 1;
			System.out.printf("%" + (n - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}

	}

	private static void patter2(int n) {
		int i, j, num;
		for (i = 0; i < n; i++) // outer loop for rows
		{
			num = 1;
			for (j = 0; j <= i; j++) // inner loop for rows
			{
				// printing num with a space
				System.out.print(num + " ");

				// incrementing value of num
				num++;
			}

			// ending line after each row
			System.out.println();
		}

	}

	private static void patter1(int n) {
		int k = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(k++ + " ");
			}

			System.out.println();
		}

	}
	
	private static void patter9(int num) {
		for (int i = 1; i <= 5; i++) {
			int n = 5;

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print("*");
			}
			for (int l = 2; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}


}
