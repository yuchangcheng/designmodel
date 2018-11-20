package strategy.builder.example1;

/**
 * @Author: yuchangcheng
 * @Description: 主导
 * @Date: Create in 11:38 2018/10/24
 * @Modified By:
 */
public class Director {
    //
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart();
    }
}
