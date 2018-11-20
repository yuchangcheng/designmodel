package strategy.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 22:52 2018/8/23
 * @Modified By:
 */
public class CooperateCustomerStrategy implements Strategy {
    public double calcPrice(double goodsPrice) {
        System.out.println("对于战略合作伙伴统一8折");
        return goodsPrice*0.8;
    }
}
