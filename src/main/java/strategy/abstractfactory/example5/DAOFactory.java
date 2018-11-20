package strategy.abstractfactory.example5;

/**
 * @Author: yuchangcheng
 * @Description: 抽相工厂，创建主订单、子订单对应的DAO对象
 * @Date: Create in 15:36 2018/10/23
 * @Modified By:
 */
public abstract class DAOFactory {
    public abstract OrderMainDAO createOrderMainDAO();
    public abstract OrderDetailDAO createOrderDetailDAO();
}
