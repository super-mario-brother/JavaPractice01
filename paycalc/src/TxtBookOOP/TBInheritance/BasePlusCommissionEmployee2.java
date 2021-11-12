package TxtBookOOP.TBInheritance;

public class BasePlusCommissionEmployee2 extends CommissionEmployee2{
    private double baseSalary;
    public BasePlusCommissionEmployee2(String first, String last, String nin, double sales, double rate, double salary){
        //explicit call to superclass constructor
        super(first, last, nin, sales, rate);

        setBaseSalary(salary); //validate and store baseSalary
    } //end constructor
    public void setBaseSalary(double salary){
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public double earnings(){
        //not allowed as commissionRate and grossSales are private in superclass
        return baseSalary + (commissionRate * grossSales);
    }
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "commission employee", firstName, lastName,
                "NI Number", niNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate,
                "base salary", baseSalary);
    }

}
