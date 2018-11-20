package strategy.factorymethod.example7;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 18:49 2018/10/6
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        ExportOperate operate = new ExportOperate();
        operate.export(1,"yuchangcheng");
    }
}
