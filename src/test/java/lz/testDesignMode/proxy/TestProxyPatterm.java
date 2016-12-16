/**
 * 
 */
package lz.testDesignMode.proxy;

import org.junit.Test;

/**
 * @author lizhen_pc
 *123
 */
public class TestProxyPatterm {

	@Test
	public void test() {
		Business b = new BusinessImplProxy();
		b.doAction();
	}
	@Test
	public void testThing() {
		Business b = new BusinessImplProxy();
		b.doAction("买个火车票");
	}
	@Test
	public void test02(){
		BusinessImpl bi = new BusinessImpl();
		Business b = (Business)DynamicBusinessImplProxy.factory(bi);
		b.doAction();
	}
	@Test
	public void testThing02() {
		BusinessImpl bi = new BusinessImpl();
		Business b = (Business)DynamicBusinessImplProxy.factory(bi);
		b.doAction("买个火车票");
	}
}
