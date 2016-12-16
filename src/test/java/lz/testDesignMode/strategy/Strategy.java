/**
 * 
 */
package lz.testDesignMode.strategy;

/**
 * 环境类（Context),用一个ConcreateStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Strategy访问他的数据。
 * 抽象策略类(Strategy),定义所以支持的算法的公共接口。Context使用这个接口来调用某ConcreteStragety定义的算法。
 * 具体策略类(ConcreteStrategy),以Stragety接口实现具体算法
 * @author lizhen_pc
 * 优点：可以动态的改变对象的行为
 * 缺点：客户端必须知道所有的策略类，并自行决定使用哪一个，策略模式将造成产生很多的策略类
 *123
 */
public interface Strategy {

	public void operate();
}
