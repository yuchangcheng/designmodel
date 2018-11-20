package strategy.abstractfactory.example6.dao.impl;

import strategy.abstractfactory.example6.dao.dao.DAOFactory;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:50 2018/10/23
 * @Modified By:
 */
public class XmlDAOFactory implements DAOFactory {

    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new XmlMainDAOImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new XmlDetailDAOImpl();
    }
}
