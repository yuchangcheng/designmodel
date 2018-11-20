package strategy.factorymethod.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 13:05 2018/10/4
 * @Modified By:具体的创建器实现对象
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod() {
        //重定义工厂方法，返回一个具体的product对象
        return null;
    }
}
