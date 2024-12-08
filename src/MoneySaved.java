public class MoneySaved {
    //declare data members
    private double overallCostR;
    private double overallCostW;
    private double totalSaved;
    private double averageR, averageW;

    //constructor
    public MoneySaved(){
        overallCostR = 0;
        overallCostW = 0;
        totalSaved = 0;

    }


    //compute

    public void ComputeMS(Produce myProduce, Delivery myDelivery){
        myProduce.compute();
        myDelivery.computD();
        overallCostW = myProduce.getAverageW() + myDelivery.getDeliveryPriceW();
        overallCostR = myProduce.getAverageR() + myDelivery.getDeliveryPriceR();
        totalSaved = overallCostW - overallCostR;
    }



    //getters
    public double getOverallCostR() {
        return overallCostR;
    }
    public double getOverallCostW() {
        return overallCostW;
    }
    public double getTotalSaved() {
        return totalSaved;
    }




}

