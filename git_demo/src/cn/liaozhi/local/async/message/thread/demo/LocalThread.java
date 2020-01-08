package cn.liaozhi.local.async.message.thread.demo;

import javax.security.auth.callback.Callback;
/**
 * 简单本地发送异步消息的类 
 *  消息的发送者
 * @author liaozhi
 *2018年11月23日上午2:36:25
 */
public class LocalThread implements Runnable, Callback {

	  /** 
     * 远程接收消息的类，模拟point-to-point 
     */  
    private Remote remote;  
      
    /** 
     * 发送出去的消息 
     */  
    private String message;  
      
    public LocalThread(Remote remote, String message) {  
        super();  
        this.remote = remote;  
        this.message = message;  
    }  
  
    /** 
     * 发送消息 
     */  
    public void sendMessage()  
    {  
        /**当前线程的名称**/  
        System.out.println(Thread.currentThread().getName());  
        /**创建一个新的线程发送消息**/  
        Thread thread = new Thread(this);  
        thread.start();  
        /**当前线程继续执行**/  
        System.out.println("Message has been sent by Local~!");  
    }  
  
    /** 
     * 发送消息后的回调函数 
     */  
    public void execute(Object... objects ) {  
        /**打印返回的消息**/  
        System.out.println(objects[0]);  
        /**打印发送消息的线程名称**/  
        System.out.println(Thread.currentThread().getName());  
        /**中断发送消息的线程**/  
        Thread.interrupted();  
    }  
      
    public static void main(String[] args)  
    {  
    	LocalThread local = new LocalThread(new Remote(),"Hello");  
          
        local.sendMessage();  
    }

    public void run() {  
        remote.executeMessage(message, this);  
          
    }  
  
  


}
