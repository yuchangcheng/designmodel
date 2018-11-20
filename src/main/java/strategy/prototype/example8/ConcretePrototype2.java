package strategy.prototype.example8;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 17:23 2018/11/7
 * @Modified By:
 */
public class ConcretePrototype2 implements Prototype {
    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototype2 prototype = new ConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "名称='" + name + '\'' +
                '}';
    }
}
