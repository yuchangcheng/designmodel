package strategy.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 23:58 2018/8/23
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        PaymentStrategy stragegyRMB = new RMBCash();
        PaymentContext ctx = new PaymentContext("小李", 5000, stragegyRMB);
        ctx.payNow();

    }
}
