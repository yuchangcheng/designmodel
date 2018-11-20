package strategy.abstractfactory.example3;


/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:53 2018/10/22
 * @Modified By:
 */
public class ComputerEnginner {
    private CPUApi cpu = null;
    private MainboardApi mainboardApi = null;

    public void makeComputer(AbstractFactory schema){
        //1、首先准备好装机所需要的配件
        prepareHardwares(schema);
        //2、组装机器

        //3、测试机器

        //4、交付客户
    }

    /**
     * 准备硬件
     * @param schema
     */
    private void prepareHardwares(AbstractFactory schema) {
        this.cpu = schema.createCPUApi();
        this.mainboardApi = schema.createMainboardApi();

        this.cpu.calculate();
        this.mainboardApi.installCPU();
    }
}
