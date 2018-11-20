package strategy.abstractfactory.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:53 2018/10/22
 * @Modified By:
 */
public interface AbstractFactory {
    /**
     * 创建抽象产品A的对象
     * @return 抽象产品A的对象
     */
    public AbstractProductA createProductA();
    public AbstractProductB createProductB();
}
