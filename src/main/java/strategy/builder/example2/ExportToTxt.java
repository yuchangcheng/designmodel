package strategy.builder.example2;

import java.util.Collection;
import java.util.Map;

/**
 * @Author: yuchangcheng
 * @Description:到处数据到文本文件对象
 * @Date: Create in 15:00 2018/10/25
 * @Modified By:
 */
public class ExportToTxt {

    public void export(ExportHeaderModel ehm, Map<String,Collection<ExportDataModel>> mapData, ExportFooterModel efm ){
        StringBuffer buffer = new StringBuffer();
        buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
        for(String tblName:mapData.keySet()){
            buffer.append(tblName+"\n");
            for(ExportDataModel edm:mapData.get(tblName)){
                buffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
            }
        }
        buffer.append(efm.getExportUser());
        System.out.println("输出到文本文件内容：\n"+buffer);
    }

}
