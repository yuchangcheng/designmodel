package strategy.prototype.example5;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:47 2018/11/7
 * @Modified By:
 */
public class PersonalOrder implements Cloneable,OrderApi {
    private String customerName;
    private String productId;
    private int orderProductNum=0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    @Override
    public Object clone(){
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "用户名称='" + customerName + '\'' +
                ", 产品Id='" + productId + '\'' +
                ", 订单产品数量=" + orderProductNum +
                '}';
    }
}
