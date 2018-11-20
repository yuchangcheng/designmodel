package strategy.mediator.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 11:36 2018/11/20
 * @Modified By:
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }
    //发出声音的数据
    public void soundData(String data){
        System.out.println("画外音："+data);
    }
}
