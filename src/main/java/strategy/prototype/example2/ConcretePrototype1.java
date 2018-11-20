package strategy.prototype.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:36 2018/11/5
 * @Modified By:
 */
public class ConcretePrototype1 implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
