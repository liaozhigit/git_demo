package cn.liaozhi.local.async.message.thread.demo;

/**
 * 处理消息的远程类 
 * 远程消息的接收者
 * @author liaozhi
 *2018年11月23日上午2:35:40
 */
public class Remote {
	/** 
     * 处理消息 
     * @param msg   接收的消息 
     * @param callBack  回调函数处理类 
     */  
    public void executeMessage(String msg,LocalThread callBack)  
    {  
    	
        /**模拟远程类正在处理其他事情，可能需要花费许多时间**/  
        for(int i=0;i<10000000;i++)  
        {  
              
        }  
        /**处理完其他事情，现在来处理消息**/  
        System.out.println(msg);  
        System.out.println("I hava executed the message by Local");  
        /**执行回调**/  
        callBack.execute(new String[]{"Nice to meet you~!"});  
    }  
    
    
}
