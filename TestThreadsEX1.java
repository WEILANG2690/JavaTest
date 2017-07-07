package July07;

class Mytask implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);

			
			//(奈米秒)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class TestThreadsEX1 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Mytask());
		Thread thread2 = new Thread(new Mytask());

		thread1.start();
		thread2.start();

		// 須等待 "thread1"執行完畢才會後續動作
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("finished");
	}

}
