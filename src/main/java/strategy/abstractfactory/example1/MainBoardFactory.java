package strategy.abstractfactory.example1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:23 2018/10/22
 * @Modified By:
 */
public class MainBoardFactory {
    public static MainboardApi createMainboardApi(int type){
        MainboardApi mainboard = null;
        if(type == 1){
            mainboard = new GAMainboard(1156);
        }else if(type == 2){
            mainboard = new MSIMainvoard(939);
        }
        return mainboard;
    }
}
