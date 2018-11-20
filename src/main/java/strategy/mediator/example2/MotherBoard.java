package strategy.mediator.example2;

/**
 * @Author: yuchangcheng
 * @Description: 主板实现 中介者接口
 * @Date: Create in 11:41 2018/11/20
 * @Modified By:
 */
public class MotherBoard implements Mediator{
    private CDDriver cdDriver = null;
    private CPU cpu = null;
    private SoundCard soundCard = null;
    private ViderCard viderCard = null;

    @Override
    public void changed(Colleague colleague) {
        if (colleague == cdDriver){
            this.openCDDriverReadData((CDDriver) colleague);
        }else if(colleague == cpu){
            this.openCPU((CPU)colleague);
        }

    }

    private void openCPU(CPU cpu) {
        //获取cpu处理过后的数据
        String videData = cpu.getVideData();
        String soundData = cpu.getSoundData();
        //把这些数据传递给cpu进行处理
        this.viderCard.showData(videData);
        this.soundCard.soundData(soundData);
    }

    private void openCDDriverReadData(CDDriver cd){
        //获取光驱读取的数据
        String data = cd.getData();
        //把这些数据传递给cpu进行处理
        this.cpu.executeData(data);
    }




    public CDDriver getCdDriver() {
        return cdDriver;
    }

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public ViderCard getViderCard() {
        return viderCard;
    }

    public void setViderCard(ViderCard viderCard) {
        this.viderCard = viderCard;
    }
}
