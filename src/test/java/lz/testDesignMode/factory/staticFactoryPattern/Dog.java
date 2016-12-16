/**
 * 
 */
package lz.testDesignMode.factory.staticFactoryPattern;

/**
 * @author lizhen_pc
 *123
 */
public class Dog extends Animal{

	public Dog(){
		super();
	}
	
	public Dog(String name){
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println("dog吃骨头");
	}

}
