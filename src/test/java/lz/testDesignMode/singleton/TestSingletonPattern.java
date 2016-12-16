/**
 * 
 */
package lz.testDesignMode.singleton;

import java.util.Date;

import org.junit.Test;

/**
 * @author lizhen_pc
 *123
 */
public class TestSingletonPattern {

	@Test
	public void test() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println("Singleton类的对象s1和s2是否是同一个实例："+(s1==s2));
		Date d1 = new Date();
		Date d2 = new Date();
		System.out.println("Date类的对象d1和d2是否是同一个实例："+(d1==d2));
	}

}
