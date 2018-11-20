package strategy.abstractfactory.example4;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:46 2018/10/23
 * @Modified By:
 */
public class HyMemory implements MemoryApi {
    @Override
    public void cacheData() {
        System.out.println("使用【现代】内存……");
    }
}
