package strategy.abstractfactory.example6.dao.impl;

import strategy.abstractfactory.example6.dao.dao.DAOFactory;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:21 2018/10/23
 * @Modified By:
 */
public class RdbDAOFactory implements DAOFactory {
    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }
}
