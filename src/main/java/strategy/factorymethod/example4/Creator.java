package strategy.factorymethod.example4;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 11:38 2018/10/6
 * @Modified By:
 */
public abstract class Creator {
    protected abstract Product factoryMethod();

    public void someOperation(){
        Product product = factoryMethod();
    }
}
