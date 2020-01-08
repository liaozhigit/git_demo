package cn.liaozhi.demo;
/**
*1)继承Thread类创建线程
*2)实现Runnable接口创建线程
*3)使用Callable和FutureTask创建线程
*4)使用线程池，例如用Executor框架
*5)Spring实现多线程（底层是线程池）
*6)定时器Timer （底层封装了一个TimerThread对象）
 * 

 * 继承Thread类创建线程
 * 步骤:
	 1):定义一个类A继承于java.lang.Thread类.
	 2):在A类中覆盖Thread类中的run方法.
	 3):我们在run方法中编写需要执行的操作---->run方法里的,线程执行体.
	 4):在main方法(线程)中,创建线程对象,并启动线程.
	 创建线程类对象: A类 a = new A类();
	 调用线程对象的start方法: a.start();//启动一个线程
	
	  注意:千万不要调用run方法,如果调用run方法好比是对象调用方法,依然还是只有一个线程,并没有开启新的线程.

 * @author liaozhi
 *2020年1月9日上午12:22:12
 */
public class MyThread extends Thread {
	private String str;
	private OutPuter outPuter;

	public OutPuter getOutPuter() {
		return outPuter;
	}

	public void setOutPuter(OutPuter outPuter) {
		this.outPuter = outPuter;
	}

	public MyThread(String str,OutPuter outPuter) {
		this.str = str;
		this.outPuter = outPuter;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void run() {
		
		while(true){
			try {
				Thread.sleep(10);
				outPuter.outPuter(str);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
