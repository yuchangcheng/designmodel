package strategy.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 22:47 2018/8/23
 * @Modified By:
 */
public interface Strategy {
    /**
     * @Author: yuchangcheng
     * @Description:计算价格
     * @Date: Create in 22:49 2018/8/23
     * @param goodsPrice
     */
    public double calcPrice(double goodsPrice);
}
