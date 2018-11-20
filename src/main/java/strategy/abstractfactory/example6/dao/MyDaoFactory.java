package strategy.abstractfactory.example6.dao;

import strategy.abstractfactory.example6.dao.dao.DAOFactory;
import strategy.abstractfactory.example6.dao.impl.RdbDAOFactory;
import strategy.abstractfactory.example6.dao.impl.XmlDAOFactory;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:44 2018/10/23
 * @Modified By:
 */
public class MyDaoFactory {
    public static DAOFactory createDAOFactory(int type){
        if(type == 1){
            return new RdbDAOFactory();
        }else if(type == 2){
            return new XmlDAOFactory();
        }
        return null;
    }
}
