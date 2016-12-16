/**
 * 
 */
package lz.testDesignMode.proxy;

/**
 * @author lizhen_pc
 *123
 */
public class BusinessImpl implements Business {

	public void doAction() {
		
		System.out.println(this.getClass().getSimpleName()+"买火车票回家过年");
		
	}

	public void doAction(String thing) {
		System.out.println(this.getClass().getSimpleName()+"--"+thing);
	}

}
