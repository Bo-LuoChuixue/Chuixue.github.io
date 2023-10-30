package cn.tedu.egmybatis4.pojo.vo;

public class OrdersVO {
    private String state;
    private Double amount;

    @Override
    public String toString() {
        return "OrdersVO1{" +
                "state='" + state + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
