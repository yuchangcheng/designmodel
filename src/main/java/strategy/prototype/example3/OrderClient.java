package strategy.prototype.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:30 2018/11/6
 * @Modified By:
 */
public class OrderClient {
    public static void main(String[] args) {
        PersonalOrder op = new PersonalOrder();
        op.setProductId("P0001");
        op.setOrderProductNum(2925);
        op.setCustomerName("张三");
        OrderBusiness ob = new OrderBusiness();
        ob.saveOrder(op);
    }
}
