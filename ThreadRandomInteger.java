// Program to implement multi-thread that has three threads.

import java.util.Random;

// This is the first thread that will generate random integer every 1 second.
class RandomInteger extends Thread{
	public void run() {
		Random random = new Random();  // Here Random class is used to generate random integers.
		for(int i = 0; i < 5; i++) {
			int randomInteger = random.nextInt(30);
			System.out.println("Random Integer is: "+randomInteger);
			if((randomInteger % 2) == 0){
				SquareIntegerThread st = new SquareIntegerThread(randomInteger); // This will call second thread.
				st.start();
			}
			else {
				CubeIntegerThread ct = new CubeIntegerThread(randomInteger); // This will call third thread.
				ct.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

// This is the second thread that will compute square of the integer if the random integer is even.
class SquareIntegerThread extends Thread{
	int randomInteger;
	SquareIntegerThread(int randomInteger){
		this.randomInteger = randomInteger;
	}
	public void run() {
		System.out.println("Square of the Integer " +randomInteger+ " is: " +(randomInteger * randomInteger));
	}
}

//This is the third thread that will compute cube of the integer if the random integer is odd.
class CubeIntegerThread extends Thread{
	int randomInteger;
	CubeIntegerThread(int randomInteger){
		this.randomInteger = randomInteger;
	}
	public void run() {
		System.out.println("Cube of the Integer " +randomInteger+ " is: " +(randomInteger * randomInteger * randomInteger));
	}
}
public class ThreadRandomInteger{

	public static void main(String[] args) {
		RandomInteger ri = new RandomInteger();
		ri.start();

	}

}
