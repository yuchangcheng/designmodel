package strategy.prototype.example8;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 17:31 2018/11/7
 * @Modified By:
 */
public class PrototypeManager {

    private static Map<String, Prototype> map = new HashMap<String, Prototype>();

    private PrototypeManager() {

    }

    public synchronized static void setPrototype(String prototypeId,Prototype prototype){
        map.put(prototypeId,prototype);
    }
    public synchronized static void removePrototype(String prototype){
        map.remove(prototype);
    }
    public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = map.get(prototypeId);
        if(prototype == null){
            throw new Exception("还没注册或者已经销毁！");
        }
        return prototype;
    }
}
