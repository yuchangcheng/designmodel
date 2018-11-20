package strategy.builder.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 11:42 2018/10/24
 * @Modified By:
 */
public class ConcreteBuilder implements Builder {
    private Product resultProduct;

    public Product getResult(){
        return resultProduct;
    }

    @Override
    public void buildPart() {
        //构建某个部件的功能处理
    }
}
