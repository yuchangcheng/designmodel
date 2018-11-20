package strategy.factorymethod.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 12:27 2018/10/4
 * @Modified By:创建器，声明工厂方法
 */
public abstract class Creator {
    /**
     *创建product的工厂方法
     * @return
     */
    protected abstract Product factoryMethod();

    /**
     *示意方法，实现某些功能的方法
     */
    public void someOperation(){
        //通常在这些方法实现中，需要调用工厂方法来获取product对
        Product product = factoryMethod();
    }
}
