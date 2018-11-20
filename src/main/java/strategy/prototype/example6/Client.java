package strategy.prototype.example6;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:17 2018/11/7
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        PersonalOrder oa1 = new PersonalOrder();
        Product product = new Product();
        product.setProdcuteId("1");
        product.setName("产品");
        oa1.setProduct(product);
        oa1.setOrderProductNum(100);
        oa1.setCustomerName("客户1");

        PersonalOrder oa2 = (PersonalOrder) oa1.cloneOrder();
        oa2.getProduct().setProdcuteId("2");
        oa2.getProduct().setName("产品2");
        oa2.setOrderProductNum(1000);
        oa2.setCustomerName("客户2");
        System.out.println(oa1+"\n----------\n"+oa2);
    }
}
