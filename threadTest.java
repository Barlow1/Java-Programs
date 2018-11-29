//Christian Barlow
//CS 349
// 9 Nov 2018
//Assignment #3
package threadTest;

public class threadTest extends Thread{
	public static int magicNum = 1234;
	static int win = 0;
	public static void main(String[] args) throws InterruptedException {
		
	Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
			while(win == 0) {
				int randInt =  (int)(Math.random()*10000);
				
				System.out.println("Thread A created number " + randInt);
				if((randInt%7)== 0) {
					win += 1;
				}
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
		}
	
	); 
	t1.setName("AThread");
	Thread t2 = new Thread(new Runnable() {
		@Override
		public void run() {
			while(win == 0) {
				int randInt =  (int)(Math.random()*10000);
				
				System.out.println("Thread B created number " + randInt);
				if((randInt%7)== 0) {
					win += 2;
				}
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}});
	t2.setName("BThread");
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	
	if (win == 1) {
		System.out.println("Thread A is the winner!!");
	}
	if (win == 2) {
		System.out.println("Thread B is the winner!!");
	}
	if (win == 3) {
		System.out.println("It is a tie game!!");
	}
	
	System.out.println("All threads are done!!");
	

	}
}
	
	

