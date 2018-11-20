package strategy.abstractfactory.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:45 2018/10/22
 * @Modified By:
 */
public class GAMainboard implements MainboardApi {
    /**
     * cpu插槽的孔数
     */
    private int cpuHoles = 0;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("技嘉主板的插槽孔数："+cpuHoles);
    }
}
