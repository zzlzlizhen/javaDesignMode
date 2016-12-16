/**
 * 
 */
package lz.testDesignMode.singleton;

/**
 * @author lizhen_pc
 * 单例模式特点：
 * 1、单例类只能有一个实例
 * 2、单例类必须自己创建自己的唯一实例
 * 3、单例类必须给所有其他对象提供这一实例
 * 
 * 此单例模式为懒汉模式：在第一次调用该对象实例的时候初始化。
 * 饿汉模式，该类创建的时候直接初始化一个实例（天生就是线程安全的）
 *123
 */
public class Singleton {

	private static Singleton uniqueInstance = null;
	
	private Singleton(){
		
	}
	public static Singleton getInstance(){
           if (uniqueInstance == null) {    
        	   uniqueInstance = new Singleton();   
           }    
		return uniqueInstance;
	}
	
	public static Singleton getInstanceBySynchronizedy(){
		if (uniqueInstance == null) {    
            synchronized (Singleton.class) {    
               if (uniqueInstance == null) {    
            	   uniqueInstance = new Singleton();   
               }    
            }    
        }    
		return uniqueInstance;
	}
}
