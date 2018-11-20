package strategy.builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:59 2018/10/30
 * @Modified By:
 */
public class TxtBuilder implements Builder{
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for(String tblName:mapData.keySet()){
            buffer.append(tblName+"\n");
            for(ExportDataModel edm:mapData.get(tblName)){
                buffer.append(edm.getProductId()+","+edm.getAmount()+","+edm.getPrice()+"\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append(efm.getExportUser()+"\n");
    }

    public StringBuffer getRuslt(){
        return buffer;
    }
}
