package strategy.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 23:47 2018/8/23
 * @Modified By:
 */
public interface PaymentStrategy {
    public void pay(PaymentContext ctx);
}
