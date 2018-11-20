package strategy.mediator.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:28 2018/11/19
 * @Modified By:
 */
public class ConcreateColleagurA extends Colleague {
    public ConcreateColleagurA(Mediator mediator) {
        super(mediator);
    }
    public void someOperation(){
        getMediator().changed(this);
    }
}
