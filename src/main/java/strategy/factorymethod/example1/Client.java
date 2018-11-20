package strategy.factorymethod.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:49 2018/10/4
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        ExportOperate operate = new ExportOperate();
        operate.export(2,"要导出的测试数据");
    }
}
