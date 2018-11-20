package strategy.abstractfactory.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:53 2018/10/22
 * @Modified By:
 */
public class ComputerEnginner {
    private CPUApi cpu = null;
    private MainboardApi mainboardApi = null;

    public void makeComputer(int cpuType,int mainboardType){
        //1、首先准备好装机所需要的配件
        prepareHardwares(cpuType,mainboardType);
        //2、组装机器

        //3、测试机器

        //4、交付客户
    }

    /**
     * 准备硬件
     * @param cpuType cpu类型
     * @param mainboardType 主板类型
     */
    private void prepareHardwares(int cpuType, int mainboardType) {
        this.cpu = CPUFactory.createCPUApi(cpuType);
        this.mainboardApi = MainBoardFactory.createMainboardApi(mainboardType);

        this.cpu.calculate();
        this.mainboardApi.installCPU();
    }
}
