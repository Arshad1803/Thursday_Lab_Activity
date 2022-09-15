// Program of creating a subclass of Thread and then creating, initializing, and starting two Thread objects from the main class.

class MyThread extends Thread

{
	String message[] = {"Java", "is", "hot,", "aromatic,", "and", "invigorating."};
	public void run()
	{
		String name = getName();
		for (int i = 0; i < message.length; i++) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {

				System.out.println(e);

			}
			System.out.println(name + message[i]);
		}
	}
}
public class ThreadConcurrent {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		thread1.setName("Thread1: ");
		thread2.setName("Thread2: ");
		
		thread1.start();
		thread2.start();
	}
}
