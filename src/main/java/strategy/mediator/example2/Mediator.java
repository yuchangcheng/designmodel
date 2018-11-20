package strategy.mediator.example2;

/**
 * @Author: yuchangcheng
 * @Description:接口的作用是：封装隔离的
 *                封装：对象的具体实现--》中介者对象的具体实现
 *                隔离：实现对象、使用者--》中介者的具体实现对象 和 使用中介者的客户端对象
 * @Date: Create in 19:33 2018/11/19
 * @Modified By:
 */
public interface Mediator {
    public void changed(Colleague colleague);
}
