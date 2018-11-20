package strategy.abstractfactory.example1;

/**
 * @Author: yuchangcheng
 * @Description: 简单工厂
 * @Date: Create in 16:14 2018/10/22
 * @Modified By:
 */
public class CPUFactory {
    public static CPUApi createCPUApi(int type){
        CPUApi cpu = null;
        if(type==1){
            cpu = new IntelCPU(1156);
        }else if(type == 2){
            cpu = new AMDCPU(939);
        }
        return cpu;
    }
}
