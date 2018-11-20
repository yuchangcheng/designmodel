package strategy.abstractfactory.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:49 2018/10/22
 * @Modified By:
 */
public class MSIMainvoard implements MainboardApi {
    private int cpuHoles = 0;

    public MSIMainvoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("微型主板的插槽孔数："+cpuHoles);
    }
}
