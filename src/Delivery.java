public class Delivery {
    //declare variables
    private String deliveryR;
    private String deliveryW;
    protected double deliveryPriceR;
    protected double deliveryPriceW;
    private double timeArrivalR;
    private double timeArrivalW;
    private double amount;
    private double totalDR;
    private double totalDW;

    //constructor
    public Delivery() {

        deliveryR = "Uber Eats";
        deliveryW = "Private Deliveries Co.";
        deliveryPriceR = 15;
        deliveryPriceW = 10;
        timeArrivalR = 3;
        timeArrivalW = 12;
        amount = 1;
        totalDR = 0;
        totalDW = 0;
    }

    //setters
    public void setDeliveryR(String deliveryR) {
        this.deliveryR = deliveryR;
    }
    public void setDeliveryW(String deliveryW) {

        this.deliveryW = deliveryW;

    }
    public void setDeliveryPriceR(double deliveryPriceR) {
        this.deliveryPriceR = deliveryPriceR;
    }
    public void setDeliveryPriceW(double deliveryPriceW) {
        this.deliveryPriceW = deliveryPriceW;
    }
    public void setTimeArrivalR(double timeArrivalR) {
        this.timeArrivalR = timeArrivalR;

    }
    public void setTimeArrivalW(double timeArrivalW) {
        this.timeArrivalW = timeArrivalW;
    }
    public void setAmountD(double amount) {
        this.amount = amount;
    }
    public void setTotalD(double totalD) {
        this.totalDR = totalD;
    }
    public void setTotalDW(double totalDW) {
        this.totalDW = totalDW;
    }

    //compute
    public void computD() {
        totalDR = amount * deliveryPriceR;
        totalDW = amount * deliveryPriceW;
    }

    //getters
    public String getDeliveryR() {
        return deliveryR;
    }
    public String getDeliveryW() {
        return deliveryW;
    }
    public double getDeliveryPriceR() {
        return deliveryPriceR;
    }
    public double getDeliveryPriceW() {
        return deliveryPriceW;
    }
    public double getTimeArrivalR() {
        return timeArrivalR;
    }
    public double getTimeArrivalW() {
        return timeArrivalW;
    }
    public double getAmountD() {
        return amount;

    }
    public double getTotalD() {
        return totalDR;
    }
    public double getTotalDW() {
        return totalDW;
    }
}
