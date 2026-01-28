package stringprogram.java8;

public class FuntctionInterfaceExample {

	public static void main(String[] args) {
		// create anonymous inner class object
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();

	}

}
