package strategy.factorymethod.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 13:43 2018/10/4
 * @Modified By:实现到处数据的业务功能对象
 */
public abstract class ExportOperate {
    public ABC createABC(String name){
        return new ABC(name,factoryMethod());
    }


    public boolean export (String data){
        System.out.println("now 进行数据校验");
        System.out.println("now 进行数据转换");
        System.out.println("now 进行数据格式的封装");

        ExportFileApi api = factoryMethod();

        return api.export(data);
    }

    protected abstract ExportFileApi factoryMethod();
}
