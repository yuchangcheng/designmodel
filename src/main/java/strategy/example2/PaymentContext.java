package strategy.example2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 23:53 2018/8/23
 * @Modified By:
 */
public class PaymentContext {
    private String userName = null;
    private double money = 0.0;
    private PaymentStrategy strategy;

    public PaymentContext(String userName, double money, PaymentStrategy strategy) {
        this.userName = userName;
        this.money = money;
        this.strategy = strategy;
    }

    public void payNow(){
        this.strategy.pay(this);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
