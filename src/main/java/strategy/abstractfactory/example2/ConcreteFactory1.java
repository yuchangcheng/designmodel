package strategy.abstractfactory.example2;

/**
 * @Author: yuchangcheng
 * @Description:具体的工厂实现对象，实现创建具体的产品对象的操作
 * @Date: Create in 14:58 2018/10/22
 * @Modified By:
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
