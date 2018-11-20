package strategy.abstractfactory.example5;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:23 2018/10/23
 * @Modified By:
 */
public class RdbMainDAOImpl implements OrderMainDAO {
    @Override
    public void saveOrderMain() {
        System.out.println("使用【关系数据库】保存【主订单】数据");
    }
}
