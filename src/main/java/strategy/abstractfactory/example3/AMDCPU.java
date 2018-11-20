package strategy.abstractfactory.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:09 2018/10/22
 * @Modified By:
 */
public class AMDCPU implements CPUApi {
    /**
     * cpu的针脚数目
     */
    private int pins = 0;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("现在是AMD CPU，针脚数为："+pins);
    }
}
