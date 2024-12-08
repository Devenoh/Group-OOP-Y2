
import javax.swing.JOptionPane;

public class Financial {
    public Financial() {
        //declare var
        String retailerName1, retailerName2, retailerName3, wholesalerName1, wholesalerName2, wholesalerName3;
        double retailerPrice1, retailerPrice2, retailerPrice3, wholesalerPrice1, wholesalerPrice2, wholesalerPrice3, prod1, prod2, prod3, prod4, prod5, prod6, amount, totalDR, totalDW, timeArrivalR, timeArrivalW, averageR, averageW, overallCostR, overallCostW, totalSaved;


        retailerName1 = "Walmart";
        retailerName2 = "Kroger";
        retailerName3 = "Tesco";
        wholesalerName1 = "Sysco Corp.";
        wholesalerName2 = "US Foods";
        wholesalerName3 = "Metro AG";
        totalDR = 15;
        totalDW = 10;
        timeArrivalR = 3;
        timeArrivalW = 12;

        //declare objects
        Produce myProduce;
        Delivery myDelivery;
        MoneySaved myMoneySaved;

        //create objects
        myProduce = new Produce();
        myDelivery = new Delivery();
        myMoneySaved = new MoneySaved();

        //input
        amount = Double.parseDouble(JOptionPane.showInputDialog("Enter product and delivery amount"));
        myProduce.setAmount(amount);



        //process
        myProduce.compute();
        myDelivery.computD();
        myMoneySaved.ComputeMS(myProduce, myDelivery);

        //output
        prod1 = myProduce.getProd1();
        JOptionPane.showMessageDialog(null, "The total cost is "+prod1+ " if you buy from "+retailerName1+ " ");
        prod2 = myProduce.getProd2();
        JOptionPane.showMessageDialog(null, "The total cost is "+prod2+ " if you buy from "+retailerName2+ " ");
        prod3 = myProduce.getProd3();
        JOptionPane.showMessageDialog(null, "The total cost is "+prod3+ " if you buy from "+retailerName3+ " ");
        prod4 = myProduce.getProd4();
        JOptionPane.showMessageDialog(null, "The total cost is "+prod4+ " if you buy from "+wholesalerName1+ " ");
        prod5 = myProduce.getProd5();
        JOptionPane.showMessageDialog(null, "The total cost is "+prod5+ " if you buy from "+wholesalerName2+ " ");
        prod6 = myProduce.getProd6();
        JOptionPane.showMessageDialog(null, "The total cost is "+prod6+ " if you buy from "+wholesalerName3+ " ");
        totalDR = myDelivery.getTotalD();
        JOptionPane.showMessageDialog(null, "It will cost you " +totalDR+ "  if you order from "+retailerName1+ ", " +retailerName2+ "or " +retailerName3+ " it will also take " +timeArrivalR+ " days to arrive");
        totalDW = myDelivery.getTotalDW();
        JOptionPane.showMessageDialog(null, "It will cost you " +totalDW+ "  if you order from "+wholesalerName1+ ", " +wholesalerName2+ "or " +wholesalerName3+ " it will also take " +timeArrivalW+ " days to arrive");
        averageR = myProduce.getAverageR();
        JOptionPane.showMessageDialog(null, "This is the average cost of buying from the listed retailers "+averageR);
        averageW = myProduce.getAverageW();
        JOptionPane.showMessageDialog(null, "This is the average cost of buying from the listed wholesalers "+averageW);
        overallCostR = myMoneySaved.getOverallCostR();
        JOptionPane.showMessageDialog(null,"The overall cost from ordering from the average retailers and delivery is "+overallCostR);
        overallCostW = myMoneySaved.getOverallCostW();
        JOptionPane.showMessageDialog(null, "The overall cost from ordering from the average wholesalers and delivery is "+overallCostW);
        totalSaved = myMoneySaved.getTotalSaved();
        JOptionPane.showMessageDialog(null,"You will save " +totalSaved+ " if you order from the retailers");
    }
}