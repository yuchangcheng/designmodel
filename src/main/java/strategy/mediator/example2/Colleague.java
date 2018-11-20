package strategy.mediator.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:32 2018/11/19
 * @Modified By:
 */
public abstract class Colleague {
    //持有中介者对象，每个同事类都知道它的中介者对象
    private Mediator mediator;

    //构造方法，传入中介者对象
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    //获取当前同事类对应的中介者对象
    public Mediator getMediator() {
        return mediator;
    }
}
