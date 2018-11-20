package strategy.prototype.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 17:01 2018/11/5
 * @Modified By:
 */
public class Client {
    private Prototype prototype;
    public Client (Prototype prototype){
        this.prototype = prototype;
    }
    public void operation(){
        Prototype newPrototype = prototype.clone();
    }
}
