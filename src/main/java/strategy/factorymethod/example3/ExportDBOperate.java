package strategy.factorymethod.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:45 2018/10/4
 * @Modified By:
 */
public class ExportDBOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDB();
    }
}
