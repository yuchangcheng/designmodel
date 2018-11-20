package strategy.prototype.example6;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:44 2018/11/7
 * @Modified By:
 */
public class Product implements ProductPrototype {
    private String prodcuteId;
    private String name;

    @Override
    public ProductPrototype cloneProduct() {
        Product product = new Product();
        product.setName(this.name);
        product.setProdcuteId(this.prodcuteId);
        return product;
    }

    public String getProdcuteId() {
        return prodcuteId;
    }

    public void setProdcuteId(String prodcuteId) {
        this.prodcuteId = prodcuteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "产品Id='" + prodcuteId + '\'' +
                ", 产品名称='" + name + '\'' +
                '}';
    }
}
