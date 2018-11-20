package strategy.prototype.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:28 2018/11/5
 * @Modified By:
 */
public class EnterpriseOrder implements OrderApi{
    private String enterpriseName;
    private String productId;
    private int enterpriseNum;

    @Override
    public int getOrderProductNum() {
        return this.enterpriseNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.enterpriseNum = num;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "EnterpriseOrder{" +
                "公司名称='" + enterpriseName + '\'' +
                ", 产品编号='" + productId + '\'' +
                ", 公司订单数目=" + enterpriseNum +
                '}';
    }
}
