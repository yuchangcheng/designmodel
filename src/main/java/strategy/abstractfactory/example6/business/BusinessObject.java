package strategy.abstractfactory.example6.business;

import strategy.abstractfactory.example6.dao.MyDaoFactory;
import strategy.abstractfactory.example6.dao.dao.DAOFactory;
import strategy.abstractfactory.example6.dao.impl.OrderDetailDAO;
import strategy.abstractfactory.example6.dao.impl.OrderMainDAO;
import strategy.abstractfactory.example6.dao.impl.XmlDAOFactory;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:10 2018/10/23
 * @Modified By:
 */
public class BusinessObject {
    public static void main(String[] args) {
        //创建DAO工厂
//        DAOFactory df = new RdbDAOFactory();
//        DAOFactory df = new XmlDAOFactory();
        DAOFactory df = MyDaoFactory.createDAOFactory(2);
                //通过抽象工厂来获取需要的DAO接口
        OrderMainDAO orderMainDAO = df.createOrderMainDAO();
        OrderDetailDAO orderDetailDAO = df.createOrderDetailDAO();
        //调用DAO来完成数据存储的功能
        orderMainDAO.saveOrderMain();
        orderDetailDAO.saveOrderDetail();
    }
}
