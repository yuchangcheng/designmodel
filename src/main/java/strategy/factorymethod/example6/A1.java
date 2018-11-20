package strategy.factorymethod.example6;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 12:53 2018/10/6
 * @Modified By:
 */
public abstract class A1 {
    protected abstract C1 createC1();
    public void t1(){
        createC1().tc();
    }
}
