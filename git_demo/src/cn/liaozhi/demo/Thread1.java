package cn.liaozhi.demo;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Thread th1 = new Thread("th1");
		th1.start();
	}

}
