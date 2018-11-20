package strategy.abstractfactory.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:21 2018/10/22
 * @Modified By:
 */
public interface AbstractFactory {
    public CPUApi createCPUApi();
    public MainboardApi createMainboardApi();
}
