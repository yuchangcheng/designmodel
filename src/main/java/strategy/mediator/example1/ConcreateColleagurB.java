package strategy.mediator.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:40 2018/11/19
 * @Modified By:
 */
public class ConcreateColleagurB extends Colleague{
    public ConcreateColleagurB(Mediator mediator) {
        super(mediator);
    }
    public void someOperation(){
        getMediator().changed(this);
    }
}
