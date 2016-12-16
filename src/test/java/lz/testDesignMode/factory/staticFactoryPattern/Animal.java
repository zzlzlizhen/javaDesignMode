/**
 * 
 */
package lz.testDesignMode.factory.staticFactoryPattern;

/**
 * @author lizhen_pc
 *123
 */
public abstract class Animal {

	private String name;
	public Animal(){
		super();
	};
	public Animal(String name){
		super();
		this.name=name;
	}
	
	/**
	 * 抽象方法
	 * 描述：
	 * 作者：李震
	 * 时间：2016年12月16日 下午3:36:20
	 */
	public abstract void eat();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
