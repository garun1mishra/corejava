package javaprograms.studyjava;

public class EnumTest {

	private enum LOAN {
        HOME_LOAN {
            @Override
            public String toString() {
                return "Always look for cheaper Home loan";

            }
        },
        AUTO_LOAN {
            @Override
            public String toString() {
                return "Cheaper Auto Loan is better";
            }
        },
        PEROSNAL_LOAN{
            @Override
            public String toString() {
                return "Personal loan is not cheaper any more";
            }
        }
    }

	public static void main(String[] args) {
		// Exmaple of Converting String to Enum in Java
		 System.out.println("String to Enum ===>>");
        LOAN homeLoan = LOAN.valueOf("HOME_LOAN");
        System.out.println(homeLoan);

        LOAN autoLoan = LOAN.valueOf("AUTO_LOAN");
        System.out.println(autoLoan);

        LOAN personalLoan = LOAN.valueOf("PEROSNAL_LOAN");
        System.out.println(personalLoan);

        
        System.out.println("Enum to String ===>>");
        
        
     // Java example to convert Enum to String in Java
        String homeLoan1 = LOAN.HOME_LOAN.name();
       System.out.println(homeLoan1);

       String autoLoan1 = LOAN.AUTO_LOAN.name();
       System.out.println(autoLoan1);

       String personalLoan1 = LOAN.PEROSNAL_LOAN.name();
       System.out.println(personalLoan1);
	}

}
