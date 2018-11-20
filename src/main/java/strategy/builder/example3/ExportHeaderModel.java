package strategy.builder.example3;

/**
 * @Author: yuchangcheng
 * @Description:描叙输出到文件头的内容的对象
 * @Date: Create in 15:07 2018/10/25
 * @Modified By:
 */
public class ExportHeaderModel {
    //分公司或门市点编号
    private String depId;
    //导出数据的日期
    private String exportDate;

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }

    public String getDepId() {

        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }
}
