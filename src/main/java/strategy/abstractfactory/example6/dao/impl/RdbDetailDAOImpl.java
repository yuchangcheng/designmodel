package strategy.abstractfactory.example6.dao.impl;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:23 2018/10/23
 * @Modified By:
 */
public class RdbDetailDAOImpl implements OrderDetailDAO {
    @Override
    public void saveOrderDetail() {
        System.out.println("使用【关系数据库】保存【子菜单】数据");
    }
}
