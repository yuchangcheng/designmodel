package strategy.factorymethod.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 13:53 2018/10/4
 * @Modified By:
 */
public class ExportXmlFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("到处数据"+data+"到文本xml文件");
        return true;
    }
}
