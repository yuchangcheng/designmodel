package strategy.abstractfactory.example4;


/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:53 2018/10/22
 * @Modified By:
 */
public class ComputerEnginner {
    private CPUApi cpu = null;
    private MainboardApi mainboardApi = null;
    private MemoryApi memory = null;

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
        this.cpu = (CPUApi) schema.createProduct(1);
        this.mainboardApi = (MainboardApi)schema.createProduct(2);
        this.memory = (MemoryApi)schema.createProduct(3);

        this.cpu.calculate();
        this.mainboardApi.installCPU();
        if(memory != null){
            this.memory.cacheData();
        }
    }
}
