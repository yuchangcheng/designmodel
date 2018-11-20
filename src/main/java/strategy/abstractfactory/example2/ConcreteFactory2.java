package strategy.abstractfactory.example2;

/**
 * @Author: yuchangcheng
 * @Description:具体的工厂实现对象，实现创建具体的产品对象的操作
 * @Date: Create in 15:00 2018/10/22
 * @Modified By:
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
