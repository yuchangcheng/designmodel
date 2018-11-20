package strategy.factorymethod.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:49 2018/10/4
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
//        ExportOperate operate = new ExportDBOperate();
        ExportOperate operate = new ExportTxtFileOperate();
        operate.export("要导出的测试数据");

//        operate.createABC("yuchangcheng").test();
    }
}
