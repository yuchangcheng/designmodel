package strategy.builder.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 11:39 2018/10/29
 * @Modified By:
 */
public class ExportDataModel {
    //编号
    private String productId;
    //价格
    private double price;
    //数量
    private double amount;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
