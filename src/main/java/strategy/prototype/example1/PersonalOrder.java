package strategy.prototype.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:08 2018/11/5
 * @Modified By:
 */
public class PersonalOrder implements OrderApi {

    private String customerName;
    private String productId;
    private int productNum = 0;

    @Override
    public int getOrderProductNum() {
        return this.productNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.productNum = num;
    }

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
    public String toString() {
        return "PersonalOrder{" +
                "  姓名='" + customerName + '\'' +
                ", 产品id='" + productId + '\'' +
                ", 产品数量=" + productNum +
                '}';
    }
}
