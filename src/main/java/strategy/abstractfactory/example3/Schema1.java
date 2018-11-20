package strategy.abstractfactory.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:24 2018/10/22
 * @Modified By:
 */
public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard(1156);
    }
}
