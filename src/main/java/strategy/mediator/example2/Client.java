package strategy.mediator.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 12:05 2018/11/20
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        //创建主板对象
        MotherBoard mediator = new MotherBoard();
        //创建同事类
        CDDriver cd = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        SoundCard sc = new SoundCard(mediator);
        ViderCard vc = new ViderCard(mediator);
        //让中介者知道所有事情
        mediator.setCdDriver(cd);
        mediator.setCpu(cpu);
        mediator.setSoundCard(sc);
        mediator.setViderCard(vc);
        //开始看电影
        cd.readCD();
    }
}
