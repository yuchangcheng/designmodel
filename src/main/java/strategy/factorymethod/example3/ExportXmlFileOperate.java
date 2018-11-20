package strategy.factorymethod.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 13:53 2018/10/4
 * @Modified By:
 */
public class ExportXmlFileOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportXmlFile();
    }
}
