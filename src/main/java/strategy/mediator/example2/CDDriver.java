package strategy.mediator.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:36 2018/11/19
 * @Modified By:
 */
public class CDDriver extends Colleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }
    private String data = "";

    public String getData(){
        return this.data;
    }

    public void readCD(){
        this.data = "设计模式，值得研究";
        //通知主板发生了改变
        this.getMediator().changed(this);
    }
}
