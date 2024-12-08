public class Produce {
    //declare data members
    private String retailerName1;
    private String retailerName2;
    private String retailerName3;
    private String wholesalerName1;
    private String wholesalerName2;
    private String wholesalerName3;
    private double retailerPrice1;
    private double retailerPrice2;
    private double retailerPrice3;
    private double wholesalerPrice1;
    private double wholesalerPrice2;
    private double wholesalerPrice3;
    private double prod1;
    private double prod2;
    private double prod3;
    private double prod4;
    private double prod5;
    private double prod6;
    private double amount;
    protected double averageR, averageW;

    //constructor
    public Produce() {
        retailerName1 = "Walmart";
        retailerName2 = "Kroger";
        retailerName3 = "Tesco";
        wholesalerName1 = "Sysco Corp.";
        wholesalerName2 = "US Foods";
        wholesalerName3 = "Metro AG";
        retailerPrice1 = 2;
        retailerPrice2 = 4;
        retailerPrice3 = 6;
        wholesalerPrice1 = 15;
        wholesalerPrice2 = 30;
        wholesalerPrice3 = 60;
        prod1 = 0;
        prod2 = 0;
        prod3 = 0;
        prod4 = 0;
        prod5 = 0;
        prod6 = 0;
        amount = 0;
        averageR = 0;
        averageW = 0;

    }

    //setters
    public void setRetailerPrice1(double retailerPrice1) {
        this.retailerPrice1 = retailerPrice1;
    }
    public void setRetailerPrice2(double retailerPrice2) {
        this.retailerPrice2 = retailerPrice2;
    }
    public void setRetailerPrice3(double retailerPrice3) {
        this.retailerPrice3 = retailerPrice3;
    }
    public void setWholesalerPrice1(double wholesalerPrice1) {
        this.wholesalerPrice1 = wholesalerPrice1;

    }
    public void setWholesalerPrice2(double wholesalerPrice2) {
        this.wholesalerPrice2 = wholesalerPrice2;
    }
    public void setWholesalerPrice3(double wholesalerPrice3) {
        this.wholesalerPrice3 = wholesalerPrice3;
    }
    public void setProd1(double prod1) {
        this.prod1 = prod1;
    }
    public void setProd2(double prod2) {
        this.prod2 = prod2;
    }
    public void setProd3(double prod3) {
        this.prod3 = prod3;
    }
    public void setProd4(double prod4) {
        this.prod4 = prod4;
    }
    public void setProd5(double prod5) {
        this.prod5 = prod5;
    }
    public void setProd6(double prod6) {
        this.prod6 = prod6;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setAverageR(double averageR) {
        this.averageR = averageR;
    }
    public void setAverageW(double averageW) {
        this.averageW = averageW;
    }

    //compute
    public void compute() {
        prod1 = amount * retailerPrice1;
        prod2 = amount * retailerPrice2;
        prod3 = amount * retailerPrice3;
        prod4 = amount * wholesalerPrice1;
        prod5 = amount * wholesalerPrice2;
        prod6 = amount * wholesalerPrice3;
        averageR = (prod1 + prod2 + prod3)/3;
        averageW = (prod4 + prod5 + prod6)/3;
    }



    //getters
    public String getRetailerName1() {
        return retailerName1;
    }
    public String getRetailerName2() {
        return retailerName2;
    }
    public String getRetailerName3() {
        return retailerName3;
    }
    public String getWholesalerName1() {
        return wholesalerName1;
    }
    public String getWholesalerName2() {
        return wholesalerName2;
    }
    public String getWholesalerName3() {
        return wholesalerName3;
    }
    public double getRetailerPrice1() {
        return retailerPrice1;
    }
    public double getRetailerPrice2() {
        return retailerPrice2;
    }
    public double getRetailerPrice3() {
        return retailerPrice3;
    }
    public double getWholesalerPrice1() {
        return wholesalerPrice1;
    }
    public double getWholesalerPrice2() {
        return wholesalerPrice2;
    }
    public double getWholesalerPrice3() {
        return wholesalerPrice3;

    }
    public double getProd1() {
        return prod1;
    }
    public double getProd2() {
        return prod2;
    }
    public double getProd3() {
        return prod3;
    }
    public double getProd4() {
        return prod4;
    }
    public double getProd5() {
        return prod5;
    }
    public double getProd6() {
        return prod6;
    }

    public double getAmount() {
        return amount;
    }
    public double getAverageR() {
        return averageR;
    }
    public double getAverageW() {
        return averageW;
    }
}
