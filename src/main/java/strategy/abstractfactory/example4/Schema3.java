package strategy.abstractfactory.example4;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:24 2018/10/22
 * @Modified By:
 */
public class Schema3 implements AbstractFactory {

    @Override
    public Object createProduct(int type) {
        Object retObj = null;
        if(type == 1){
            retObj = new AMDCPU(1156);
        }else if(type == 2){
            retObj = new MSIMainboard(1156);
        }else if(type ==3){
            retObj = new HyMemory();
        }
        return retObj;
    }
}
