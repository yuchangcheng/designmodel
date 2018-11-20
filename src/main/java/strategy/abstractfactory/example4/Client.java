package strategy.abstractfactory.example4;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:27 2018/10/22
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        ComputerEnginner enginner = new ComputerEnginner();
        AbstractFactory schema = new Schema3();
        enginner.makeComputer(schema);
    }
}
