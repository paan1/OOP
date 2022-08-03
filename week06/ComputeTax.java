
public class ComputeTax {
    private double income = 0;
    private int filter = 0;
    public ComputeTax() {
    }
    String[] filterType = {"Single filer", "Married jointly-or qualifying widow(er)", "Married separately","Head of household"};
    double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    int[][] brackets = {
            { 8350, 33950, 82250, 171550, 372950 },
            { 16700, 67900, 137050, 20885, 372950 },
            { 8350, 33950, 68525, 104425, 186475 },
            { 11950, 45500, 117450, 190200, 372950 }
    };
    public void setIncome(double income) {
        this.income = (income>0)?income:0;
    }
    public double getIncome() {
        return income;
    }
    public String getFilterType(int index) {
        return filterType[index];
    }
    public void setFilter(int filter){
        this.filter = (filter>=0 && filter<=3)?filter:0;
    }
    public double getTax() {
        double tax = 0;
        double upperBound,lowerBound;
        int n = 5;
        for(int i = 0; i <5;i++){
            if(income <= brackets[filter][i]){
                n=i;
                break;
            }
        }
        for(int i = 0; i <=n;i++){
            upperBound = (i==5 || n==i)?income:brackets[filter][i];
            lowerBound = (i==0)?0:brackets[filter][i-1];
            tax += (upperBound-lowerBound)*rates[i];
        }
        return tax;
    }
}