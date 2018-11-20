package strategy.builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 17:12 2018/10/30
 * @Modified By:
 */
public class XmlBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append("<?xml version='1.0' encoding='gb2312' ?>\n");
        buffer.append("<Report>\n");
        buffer.append(" <Header>\n");
        buffer.append("     <DepId>"+ehm.getDepId()+"</DepId>\n");
        buffer.append("     <ExportDate>"+ehm.getExportDate()+"</ExportDate>\n");
        buffer.append(" </Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        buffer.append(" <Body>\n");
        for(String tblName:mapData.keySet()){
            buffer.append("     <Datas TableName=\""+tblName+"\">\n");
            for(ExportDataModel edm:mapData.get(tblName)){
                buffer.append("     <Date>\n");
                buffer.append("         <ProductId>"+edm.getProductId()+"</ProductId>\n");
                buffer.append("         <Price>"+edm.getPrice()+"</Price>\n");
                buffer.append("         <Amount>"+edm.getAmount()+"</Amount>\n");
            }
            buffer.append("     </Datas>\n");
        }
        buffer.append(" </Body>\n");
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append(" <Footer>\n");
        buffer.append("     <ExportUser>"+efm.getExportUser()+"</ExportUser>\n");
        buffer.append(" </Footer>\n");
        buffer.append("</Report>\n");
    }

    public StringBuffer getResult(){
        return buffer;
    }
}
