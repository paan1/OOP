public class Pro1_64010476 {
    public static void main(String[] args)
    {
        long People = 312032486;
        long yeartime = 31536000;
        double Birth ,Death ,Immigrant,PopulationYearone,PopulationYeartwo,PopulationYearthree,PopulationYearfour,PopulationYearfive;
        Birth = yeartime / 7.0F;
        Death = yeartime / 13.0F;
        Immigrant = yeartime / 45.0F;
        PopulationYearone = People + Birth - Death + Immigrant;
        PopulationYeartwo = People + (Birth - Death + Immigrant)*2;
        PopulationYearthree = People + (Birth - Death + Immigrant)*3;
        PopulationYearfour = People + (Birth - Death + Immigrant)*4;
        PopulationYearfive = People + (Birth - Death + Immigrant)*5;
        System.out.println("Population of each 5 years");
        System.out.printf("One year:%.0f\n",PopulationYearone);
        System.out.printf("Two year:%.0f\n",PopulationYeartwo);
        System.out.printf("Three year:%.0f\n",PopulationYearthree);
        System.out.printf("Four year:%.0f\n",PopulationYearfour);
        System.out.printf("Five year:%.0f\n",PopulationYearfive);


        
    }

}