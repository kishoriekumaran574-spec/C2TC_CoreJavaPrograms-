//Executor class for ChildThread
package multithreading.threadclass;

public class threatdemo {
	public static void main(String[] args) {
		childthreat threadOne = new childthreat(5, "First");
		childthreat threadTwo = new childthreat(10, "Second");

		threadOne.start();
		//threadOne.start(); // throws IllegalStateException
		// threadOne.run(); // single threaded application 
		threadTwo.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
}