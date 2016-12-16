/**
 * 
 */
package lz.testDesignMode.factory.staticFactoryPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lizhen_pc
 * 静态工厂创建一个对象，一般都有共同的属性，继承某一个类或者实现具体的接口
 *123
 */
public class StaticFactory {

	/**
	 * 根据反射机制，使用类路径来创建对象
	 * 默认是通过无参的构造方法初始化
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月16日 下午3:45:22
	 * @param className
	 * @return
	 */
	public static Object getInstance(String className){
		Object instance = null;
		try {
			Class<?> cls = Class.forName(className);
			instance = cls.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return instance;
	}
	
	/**
	 * 根据反射机制，使用类路径来创建对象
	 * 通过有参的构造方法初始化
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月16日 下午3:56:53
	 * @param className
	 * @param args
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Object getInstance(String className,Object ...args){
		Object instance = null;
		Class<?> cls = null;
		try {
			cls = Class.forName(className);
			Constructor[] constructors = cls.getConstructors();
			for(Constructor cons : constructors){
				Class<?>[] clses = cons.getParameterTypes();
				if(clses.length>0){
					boolean isThisConstructor=true;
					// 验证传递过来的参数是否和该类的构造方法的参数类型匹配
					for(int i=0;i<clses.length;i++){
						Class<?> c = clses[i];
						if(!c.isInstance(args[i])){
							isThisConstructor=false;
						}
					}
					if(isThisConstructor){
						instance = cons.newInstance(args);
						break;
					}else{
						continue;
					}
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return instance;
	}
}
