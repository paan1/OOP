public class BMI {
    private String name;
    private long age;
    private double weight;
     private double feet;
     private double inches;

    public  BMI(String name, int age, double weight, double feet, double inches) {
          setName(name);
          setAge(age);
          setWeight(weight);
          setFeet(feet);
          setInches(inches);	
    }

    public String getName() 
    {
        return name;
    }
    public long getAge() 
    {
        return age;
    }
    public double getWeight() 
    {
        return weight;
    }
    public double getFeet() 
    {
        return feet;
    }
    public double getInches() 
    {
        return inches;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(long age)
    {
        if(age > 0)this.age = age;
    }
    public void setWeight(double weight)
    {
        if(weight > 0)this.weight = weight;
    }
    public void setFeet(double feet)
    {
        if(feet > 0)this.feet = feet;
    }
    public void setInches(double inches)
    {
        if(inches > 0 && inches < 12)this.inches = inches;
    }
    public double getBMI() {
        double weightkilograms = weight*0.45359237;
        double highmeters = ((inches + feet*12.0)*0.0254);
        return weightkilograms/(highmeters*highmeters);
        
    }
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}

    
    


