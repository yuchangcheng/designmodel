package strategy.mediator.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 11:38 2018/11/20
 * @Modified By:
 */
public class ViderCard extends Colleague {
    public ViderCard(Mediator mediator) {
        super(mediator);
    }
    //显示视频数据
    public void showData(String data){
        System.out.println("您正观看的是："+data);
    }
}
