package strategy.abstractfactory.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:26 2018/10/22
 * @Modified By:
 */
public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(939);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard(939);
    }
}
