package strategy.factorymethod.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 13:53 2018/10/4
 * @Modified By:
 */
public class ExportTxtFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("【ExportTxtFile-到处数据】"+data+"【到文本文件】");
        return true;
    }
}
