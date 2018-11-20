package strategy.factorymethod.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 13:43 2018/10/4
 * @Modified By:实现到处数据的业务功能对象
 */
public class ExportOperate {
    public boolean export (int type,String data){
        System.out.println("now 进行数据校验");
        System.out.println("now 进行数据转换");
        System.out.println("now 进行数据格式的封装");

        ExportFileApi api = null;
        if(type == 1){
            api = new ExportTxtFile();
        }else if(type == 2){
            api = new ExportDB();
        }else if(type==3){
            api = new ExportXmlFile();
        }

        return api.export(data);
    }
}
