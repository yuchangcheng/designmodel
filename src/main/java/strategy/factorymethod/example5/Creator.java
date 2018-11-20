package strategy.factorymethod.example5;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 11:41 2018/10/6
 * @Modified By:
 */
public abstract class Creator {

    protected abstract Product1 factoryMethod1();

    protected abstract Product2 factoryMethod2();

    public Product createProduct(){
        Product1 p1 = factoryMethod1();
        Product2 p2 = factoryMethod2();
        Product product = new ConcreteProduct();
        product.setProduct1(p1);
        product.setProduct2(p2);
        return product;
    }
}
