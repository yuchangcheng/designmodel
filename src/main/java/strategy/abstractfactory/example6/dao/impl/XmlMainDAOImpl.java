package strategy.abstractfactory.example6.dao.impl;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:21 2018/10/23
 * @Modified By:
 */
public class XmlMainDAOImpl implements OrderMainDAO {
    @Override
    public void saveOrderMain() {
        System.out.println("使用【xml】保存【主订单】数据");
    }
}
