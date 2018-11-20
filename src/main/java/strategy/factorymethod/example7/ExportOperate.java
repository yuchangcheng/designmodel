package strategy.factorymethod.example7;

import strategy.factorymethod.example7.ExportDB;
import strategy.factorymethod.example7.ExportFileApi;
import strategy.factorymethod.example7.ExportTxtFile;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 13:43 2018/10/4
 * @Modified By:实现到处数据的业务功能对象
 */
public class ExportOperate {

    public boolean export (int type,String data){
        ExportFileApi api = factoryMethod(type);

        return api.export(data);
    }

    protected ExportFileApi factoryMethod(int type){
        ExportFileApi api = null;
        if(type == 1){
            api = new ExportTxtFile();
        }else if(type == 2){
            api = new ExportDB();
        }else if(type == 3){
            api = new ExportTxtFile();
        }
        return api;
    }
}
