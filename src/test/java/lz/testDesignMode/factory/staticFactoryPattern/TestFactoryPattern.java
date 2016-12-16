/**
 * 
 */
package lz.testDesignMode.factory.staticFactoryPattern;

import org.junit.Test;

/**
 * @author lizhen_pc
 *123
 */
public class TestFactoryPattern {

	/**
	 * 静态工厂类测试
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月16日 下午4:02:02
	 */
	@Test
	public void test() {
		Animal a1 = (Animal)StaticFactory.getInstance(Cat.class.getName());
		System.out.println(a1.getName());
		a1.eat();
		Animal a2 = (Animal)StaticFactory.getInstance(Dog.class.getName(),"kitty");
		System.out.println(a2.getName());
		a2.eat();
	}
}
