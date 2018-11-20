package strategy.abstractfactory.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:49 2018/10/22
 * @Modified By:
 */
public class MSIMainboard implements MainboardApi {
    private int cpuHoles = 0;

    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("微型主板的插槽孔数："+cpuHoles);
    }
}
