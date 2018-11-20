package strategy.mediator.example1;

/**
 * @Author: yuchangcheng
 * @Description: 同事
 * @Date: Create in 12:24 2018/11/19
 * @Modified By:
 */
public abstract class Colleague {
    private Mediator mediator;
    public Colleague (Mediator mediator){
        this.mediator = mediator;
    }
    public Mediator getMediator(){
        return mediator;
    }
}
