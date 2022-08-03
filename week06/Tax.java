public class Tax {
        public static final int 
        SINGLE_FILER = 0,
        MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1,
        MARRIED_SEPARATELY = 2,
        HEAD_OF_HOUSEHOLD = 3;
    
        private int filingStatus = 0;
        private int[][] brackets = {};
        private double[] rates = {};
        private double taxableIncome = 0;
    
        public Tax(int filingStatus,int[][] brackets,double[] rates,double taxableIncome){
            setFilingStatus(filingStatus);
            setBrackets(brackets);
            setRates(rates);
            setTaxableIncome(taxableIncome);
        }
        public int getFilingStatus() {
            return this.filingStatus;
        }
    
        public void setFilingStatus(int filingStatus) {
            this.filingStatus = (filingStatus >= 0 && filingStatus <= 3)?filingStatus:0;
        }
    
        public int[][] getBrackets() {
            return this.brackets;
        }
    
        public void setBrackets(int[][] brackets) {
            this.brackets = brackets;
        }
    
        public double[] getRates() {
            return this.rates;
        }
    
        public void setRates(double[] rates) {
            this.rates = rates;
        }
    
        public double getTaxableIncome() {
            return this.taxableIncome;
        }
    
        public void setTaxableIncome(double taxableIncome) {
            this.taxableIncome = (taxableIncome > 0)?taxableIncome:0;
        }
        public double getTax() {
            double tax = 0;
            double upperBound,lowerBound;
            int n = 5;
            for(int i = 0; i <5;i++){
                if(taxableIncome <= brackets[filingStatus][i]){
                    n=i;
                    break;
                }
            }
            for(int i = 0; i <=n;i++){
                upperBound = (i==5 || n==i)?taxableIncome:brackets[filingStatus][i];
                lowerBound = (i==0)?0:brackets[filingStatus][i-1];
                tax += (upperBound-lowerBound)*rates[i];
            }
            return tax;
        }
    }
