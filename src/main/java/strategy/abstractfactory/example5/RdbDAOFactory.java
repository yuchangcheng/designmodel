package strategy.abstractfactory.example5;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:21 2018/10/23
 * @Modified By:
 */
public class RdbDAOFactory extends DAOFactory {
    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }
}
