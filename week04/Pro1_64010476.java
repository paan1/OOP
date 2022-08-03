
public class Pro1_64010476 {

    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL","Oracle Coperation");
        oracle.previousClosingPrice = 34.5;
        oracle.currentPrice = 34.35;
        System.out.println("Symbol: "+ oracle.symbol);
        System.out.println("Name: "+ oracle.name);
        System.out.println("Previous Closing Price: "+oracle.previousClosingPrice);
        System.out.println("Current Price: "+oracle.currentPrice );
        System.out.println("Price Change: "+oracle.getChangePercent()+"%");
    }
}