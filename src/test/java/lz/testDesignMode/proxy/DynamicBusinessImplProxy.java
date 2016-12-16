/**
 * 
 */
package lz.testDesignMode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lizhen_pc
 * 动态代理的调用器实现
 *123
 */
public class DynamicBusinessImplProxy implements InvocationHandler {

	private Object obj;
	
	public DynamicBusinessImplProxy(){
		
	}
	public DynamicBusinessImplProxy(Object obj){
		this.obj=obj;
	}
	/**
	 * 由JVM在运行时动态调用的。当执行b.doAction()方法时，
	 * JVM动态指派“调用处理器”，向外层invoke传递参数，
	 * 并调用method.invoke(obj,args)真正执行！
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		doBefore();
		result = method.invoke(obj,args);
		doAfter();
		return result;
	}

	/**
	 * 来指定参数动态返回需要的代理类
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月16日 下午5:49:21
	 * @param obj
	 * @return
	 */
	public static Object factory(Object obj){
		Class<?> cls = obj.getClass();
		return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),new DynamicBusinessImplProxy(obj));
	}
	
	private void doBefore(){
		System.out.println(this.getClass().getSimpleName()+"做公交车去火车站");
	}
	private void doAfter(){
		System.out.println(this.getClass().getSimpleName()+"从火车站坐公交回来");
		System.out.println("\n");
	}
}
