package TxtBookOOP.TBInheritance;

public class CommissionEmployee2 {
    protected String firstName;
    protected String lastName;
    protected String niNumber;
    protected double grossSales; //gross weekly sales
    protected double commissionRate; //commission percentage

    //five argument constructor
    public CommissionEmployee2(String first, String last, String nin, double sales, double rate){
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
        return commissionRate * grossSales;
    }
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee", firstName, lastName,
                "NI Number", niNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate);
    }
}
