package strategy.builder.example5;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 17:29 2018/11/2
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder("001", 12345L, 67890L);
        //人的合同对象
        InsuranceContract contract = builder.setPersonName("张三丰").setOtherData("人").build();
        contract.someOperation();

        ConcreteBuilder builder2 = new ConcreteBuilder("001", 12345L, 67890L);
        //公司的合同对象
        InsuranceContract contract2 = builder2.setCompanyName("cc").setOtherData("公司").build();
        contract2.someOperation();
    }
}
