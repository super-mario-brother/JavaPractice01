package TxtBookOOP.TBInheritance;

public class CommissionEmployee3 {
    private String firstName;
    private String lastName;
    private String niNumber;
    private double grossSales; //gross weekly sales
    private double commissionRate; //commission percentage

    //five argument constructor
    public CommissionEmployee3(String first, String last, String nin, double sales, double rate){
        //implicit call to Object constructor occurs here
        firstName = first;
        lastName = last;
        niNumber = nin;
        setGrossSales(sales); //validate and store gross sales
        setCommissionRate(rate); //validate and store commission rate
    } //end constructor

    public void setFirstName( String first){
        firstName = first;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String last){
        lastName = last;
    }
    public String getLastName(){
        return lastName;
    }
    public void setniNumber(String ni){
        niNumber = ni;
    }
    public String getNiNumber(){
        return niNumber; //should validate here
    }
    public void setGrossSales(double sales){
        grossSales = (sales < 0.0) ? 0.0 : sales;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setCommissionRate(double rate ){
        commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "NI Number", getNiNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }

}
