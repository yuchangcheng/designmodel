package strategy.prototype.example5;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:05 2018/11/7
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        PersonalOrder oa1 = new PersonalOrder();
        oa1.setOrderProductNum(1000);
        PersonalOrder oa2 = (PersonalOrder)oa1.clone();
        oa2.setOrderProductNum(800);
        System.out.println("原对象-->"+oa1.getOrderProductNum()+"\n克隆对象-->"+oa2.getOrderProductNum());
    }
}
