package strategy.abstractfactory.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:52 2018/10/22
 * @Modified By:
 */
public class client {
    public static void main(String[] args) {
        ComputerEnginner computerEnginner = new ComputerEnginner();
        computerEnginner.makeComputer(1,2);
    }
}
