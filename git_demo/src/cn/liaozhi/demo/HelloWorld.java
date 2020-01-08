package cn.liaozhi.demo;
/**
 * 多线程并发测试类
 * @author liaozhi
 *2020年1月9日上午12:21:29
 */
public class HelloWorld {
	
	
	public static void main(String[] args) {
		OutPuter  out = new  OutPuter();
		MyThread thr1  = new MyThread("456",out);
		thr1.start();
		MyThread thr2 = new MyThread("zhangliyun",out);
		thr2.start();
	}
}
