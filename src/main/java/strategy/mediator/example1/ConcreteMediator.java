package strategy.mediator.example1;

/**
 * @Author: yuchangcheng
 * @Description: 中介者实现
 * @Date: Create in 19:18 2018/11/19
 * @Modified By:
 */
public class ConcreteMediator implements Mediator {
    private ConcreateColleagurA concreateColleagurA;
    private ConcreateColleagurB concreateColleagurB;

    public void setConcreateColleagurA(ConcreateColleagurA concreateColleagurA) {
        this.concreateColleagurA = concreateColleagurA;
    }

    public void setConcreateColleagurB(ConcreateColleagurB concreateColleagurB) {
        this.concreateColleagurB = concreateColleagurB;
    }

    @Override
    public void changed(Colleague colleague) {

    }
}
