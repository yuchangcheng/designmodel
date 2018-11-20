package strategy.builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 17:17 2018/10/30
 * @Modified By:
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderModel ehm, Map<String,Collection<ExportDataModel>> mapData,ExportFooterModel efm){
        builder.buildHeader(ehm);
        builder.buildBody(mapData);
        builder.buildFooter(efm);
    }
}
