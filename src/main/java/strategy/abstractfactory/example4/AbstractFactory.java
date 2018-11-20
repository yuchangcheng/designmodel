package strategy.abstractfactory.example4;

import strategy.abstractfactory.example3.CPUApi;
import strategy.abstractfactory.example3.MainboardApi;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:21 2018/10/22
 * @Modified By:
 */
public interface AbstractFactory {
    /**
     * 一个通用的创建产品对相关方法，为了简单，直接返回object
     *  也可以为所有被创建的产品定义一个公共接口
     * @param type 具体创建的产品类型标识
     * @return 创建出的产品对象
     */
    public Object createProduct(int type);
}
