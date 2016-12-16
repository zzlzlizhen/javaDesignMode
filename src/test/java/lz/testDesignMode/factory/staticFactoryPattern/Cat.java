/**
 * 
 */
package lz.testDesignMode.factory.staticFactoryPattern;

/**
 * @author lizhen_pc
 *123
 */
public class Cat extends Animal {

	public Cat(){
		super();
	}
	
	public Cat(String name){
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println("eat吃鱼");
	}

}
