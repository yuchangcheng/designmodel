package strategy.builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:40 2018/10/30
 * @Modified By:
 */
public interface Builder {
    public void buildHeader(ExportHeaderModel ehm);
    public void buildBody(Map<String,Collection<ExportDataModel>> mapData);
    public void buildFooter(ExportFooterModel efm);
}
