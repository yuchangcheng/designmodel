package strategy.builder.example6;

/**
 * @Author: yuchangcheng
 * @Description: 构建器与被构建器合并
 * @Date: Create in 12:01 2018/11/5
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("001", 12345L, 67890L);
        InsuranceContract contract = builder.setPersonName("张三").setOtherData("test").build();
        contract.someOperation();
    }
}
