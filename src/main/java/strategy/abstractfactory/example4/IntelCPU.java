package strategy.abstractfactory.example4;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:14 2018/10/22
 * @Modified By:
 */
public class IntelCPU implements CPUApi {
    /**
     * cpu的针脚数目
     */
    private int pins = 0;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("现在是Intel CPU，针脚数为："+pins);
    }
}
