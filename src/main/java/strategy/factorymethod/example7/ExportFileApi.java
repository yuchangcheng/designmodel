package strategy.factorymethod.example7;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 13:22 2018/10/4
 * @Modified By:
 */
public interface ExportFileApi {

    /**
     * 到处内容为文件
     * @param data 示意：需要保存的数据
     * @return 是否到处成功
     */
    public boolean export(String data);
}
