package strategy.abstractfactory.example5;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:50 2018/10/23
 * @Modified By:
 */
public class XmlDAOFactory extends DAOFactory {

    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new XmlMainDAOImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new XmlDetailDAOImpl();
    }
}
