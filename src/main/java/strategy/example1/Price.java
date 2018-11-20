package strategy.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 22:56 2018/8/23
 * @Modified By:
 */
public class Price {
    private Strategy strategy = null;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double price){
        return this.strategy.calcPrice(price);
    }
}
