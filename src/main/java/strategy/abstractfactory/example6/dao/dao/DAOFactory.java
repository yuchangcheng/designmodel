package strategy.abstractfactory.example6.dao.dao;

import strategy.abstractfactory.example6.dao.impl.OrderDetailDAO;
import strategy.abstractfactory.example6.dao.impl.OrderMainDAO;

/**
 * @Author: yuchangcheng
 * @Description: 抽相工厂，创建主订单、子订单对应的DAO对象
 * @Date: Create in 15:36 2018/10/23
 * @Modified By:
 */
public interface DAOFactory {
    public OrderMainDAO createOrderMainDAO();
    public OrderDetailDAO createOrderDetailDAO();
}
