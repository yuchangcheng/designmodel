package strategy.prototype.example7;

import strategy.prototype.example6.ProductPrototype;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:44 2018/11/7
 * @Modified By:
 */
public class Product implements Cloneable {
    private String prodcuteId;
    private String name;

    @Override
    public Object clone() {
        Object obj = null;
        try {
           obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
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
