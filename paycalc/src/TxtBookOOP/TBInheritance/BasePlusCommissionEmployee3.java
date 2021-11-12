package TxtBookOOP.TBInheritance;

public class BasePlusCommissionEmployee3 extends CommissionEmployee3{
    private double baseSalary;
    public BasePlusCommissionEmployee3(String first, String last, String nin, double sales, double rate, double salary){
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
        return getBaseSalary() + super.earnings();
    }
    public String toString(){
        return String.format("%s: %s\n%s: %.2f", "base salaried",
                super.toString(), "base salary", getBaseSalary());
    }

}
