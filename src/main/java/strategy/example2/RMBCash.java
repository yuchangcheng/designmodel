package strategy.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 23:50 2018/8/23
 * @Modified By:
 */
public class RMBCash implements PaymentStrategy {
    public void pay(PaymentContext ctx) {
        System.out.println("现在给"+ctx.getUserName()+"人民币现金支付"+ctx.getMoney()+"元");
    }
}
