package strategy.builder.example3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yuchangcheng
 * @Description:客户端-->指导者-->build-->build去构建复杂对象
 * @Date: Create in 15:45 2018/10/30
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        //准备测试数据
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("一分公司");
        ehm.setExportDate("2010-05-18");

        Map<String, Collection<ExportDataModel>> mapData = new HashMap<String, Collection<ExportDataModel>>();
        Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();

        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmount(80);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品002号");
        edm2.setPrice(99);
        edm2.setAmount(55);

        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录表",col);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三丰");

        //测试输入到文本文件
        TxtBuilder txtBuilder = new TxtBuilder();
        Director director = new Director(txtBuilder);
        director.construct(ehm,mapData,efm);
        System.out.println(txtBuilder.getRuslt());

        XmlBuilder xmlBuilder = new XmlBuilder();
        Director director1 = new Director(xmlBuilder);
        director1.construct(ehm,mapData,efm);
        System.out.println(xmlBuilder.getResult());
    }
}
