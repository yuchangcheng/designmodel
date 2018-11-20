package strategy.prototype.example6;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:57 2018/11/7
 * @Modified By:
 */
public class PersonalOrder implements OrderApi{
    private String customerName;
    private int orderProductNum;
    private Product product = null;

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderApi cloneOrder(){
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setCustomerName(this.customerName);
        personalOrder.setOrderProductNum(this.orderProductNum);
        personalOrder.setProduct((Product)this.product.cloneProduct());
        return personalOrder;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "客户名称='" + customerName + '\'' +
                ", 订单产品数量=" + orderProductNum +
                ", 产品=" + product +
                '}';
    }
}
