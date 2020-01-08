package cn.liaozhi.demo;
/**
 * 打印字符串
 * @author liaozhi
 *2020年1月9日上午12:21:01
 */
public class OutPuter {
	
	public synchronized void outPuter(String str){
		int len = str.length();
		for (int i = 0; i < len; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

}
