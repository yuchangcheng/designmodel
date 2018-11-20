package strategy.prototype.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:05 2018/11/5
 * @Modified By:
 */
public interface OrderApi {
   public int getOrderProductNum();
   public void setOrderProductNum(int num);
   public OrderApi cloneOrder();
}
