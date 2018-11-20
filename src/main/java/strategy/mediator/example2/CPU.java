package strategy.mediator.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 11:04 2018/11/20
 * @Modified By:
 */
public class CPU extends Colleague {
    public CPU(Mediator mediator) {
        super(mediator);
    }
    //分解出来的视频数据
    private String videData = "";
    //分解出来的音频数据
    private String soundData = "";

    public String getVideData() {
        return videData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void executeData(String data){
        String [] ss = data.split("，");
        this.videData = ss[0];
        this.soundData = ss[1];
        this.getMediator().changed(this);
    }
}
