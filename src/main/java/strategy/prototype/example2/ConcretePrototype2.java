package strategy.prototype.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:58 2018/11/5
 * @Modified By:
 */
public class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2();
        return prototype;
    }
}
