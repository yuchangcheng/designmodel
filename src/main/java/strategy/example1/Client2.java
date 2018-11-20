package strategy.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 22:55 2018/8/23
 * @Modified By:
 */
public class Client2 {
    public static void main(String[] args) {
        CooperateCustomerStrategy cooperateCustomerStrategy = new CooperateCustomerStrategy();
        Price ctx = new Price(cooperateCustomerStrategy);
        double quote = ctx.quote(1000);
        System.out.println("像客户报价："+quote);
    }
}
