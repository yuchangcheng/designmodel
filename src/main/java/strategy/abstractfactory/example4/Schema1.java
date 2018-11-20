package strategy.abstractfactory.example4;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:24 2018/10/22
 * @Modified By:
 */
public class Schema1 implements AbstractFactory {

    @Override
    public Object createProduct(int type) {
        Object retObj = null;
        if(type == 1){
            retObj = new IntelCPU(939);
        }else if(type == 2){
            retObj = new GAMainboard(939);
        }
        return retObj;
    }
}
