package strategy.factorymethod.example3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 10:52 2018/10/6
 * @Modified By:
 */
public class ABC {
    private String name = "";
    private ExportFileApi api = null;

    public ABC(String name,ExportFileApi api){
        this.name = name;
        this.api = api;
    }

    public void test(){
        System.out.println("ABC类-----test-----name-->"+name);
        this.api.export("ABC类-----test-----expot-->");
    }
}
