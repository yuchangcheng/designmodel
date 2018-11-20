package strategy.factorymethod.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:45 2018/10/4
 * @Modified By:
 */
public class ExportDB implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出数据"+data+"到数据库备份文件");
        return true;
    }
}
