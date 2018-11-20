package strategy.prototype.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:33 2018/11/5
 * @Modified By:
 */
public class OrderBusiness {
    public void saveOrder(OrderApi order ){
        while(order.getOrderProductNum() > 1000){
            OrderApi newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(1000);
            order.setOrderProductNum(order.getOrderProductNum()-1000);
            System.out.println("拆分生成订单"+newOrder);
        }
        System.out.println("订单=="+order);
    }
}
