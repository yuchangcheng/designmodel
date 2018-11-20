package strategy.abstractfactory.example6.dao.impl;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:21 2018/10/23
 * @Modified By:
 */
public class XmlDetailDAOImpl implements OrderDetailDAO {
    @Override
    public void saveOrderDetail() {
        System.out.println("使用【xml】保存【子订单】数据");
    }
}
