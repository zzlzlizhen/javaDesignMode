/**
 * 
 */
package lz.testDesignMode.proxy;

/**
 * 一般代理模式模式，就是代理类替业务操作类实现具体的业务
 * @author lizhen_pc
 *123
 * 
 */
public class BusinessImplProxy implements Business {

	private BusinessImpl bi;
	public void doAction() {
		
		if(bi==null) {
			bi=new BusinessImpl();
		}
		
		doBefore();
		bi.doAction();
		doAfter();

	}
	public void doAction(String thing) {
		if(bi==null) {
			bi=new BusinessImpl();
		}
		
		doBefore();
		bi.doAction(thing);
		doAfter();
	}
	private void doBefore(){
		System.out.println(this.getClass().getSimpleName()+"做公交车去火车站");
	}
	private void doAfter(){
		System.out.println(this.getClass().getSimpleName()+"从火车站坐公交回来");
		System.out.println("\n");
	}
}
