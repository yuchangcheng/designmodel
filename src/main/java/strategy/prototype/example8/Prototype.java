package strategy.prototype.example8;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 17:19 2018/11/7
 * @Modified By:
 */
public interface Prototype {
    public Prototype clone();
    public String getName();
    public void setName(String name);
}
