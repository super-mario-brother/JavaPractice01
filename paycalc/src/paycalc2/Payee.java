package paycalc2;

public class Payee {



    private int grosspay;
    private String name;
    private Tax tax;
    private Pension pension;
    private NationalInsurance ni;
    private int netpay;
    private int totalDeductions;

    public Payee(int grosspay, String name) {

        this.grosspay = grosspay;
        this.name = name;
        calculateDeductions();
        calculateTotals();


    }

    public void setGrosspay(int grosspay) {
        this.grosspay = grosspay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrosspay() {
        return grosspay;
    }
    public String getName() {
        return name;
    }

    public void calculateDeductions(){
        this.tax = new Tax(grosspay);
        this.pension = new Pension(grosspay);
        this.ni = new NationalInsurance(grosspay);
        this.totalDeductions = tax.taxAmount+pension.pensionAmount+ni.niAmount;
    }
    public void calculateTotals(){
        this.netpay = grosspay - (tax.taxAmount+pension.pensionAmount+ni.niAmount);
    }
    public void showInfo(){
        System.out.println(this.name + " is offered £" + this.grosspay);
        tax.printDeduction();
        pension.printDeduction();
        ni.printDeduction();
        System.out.println("Total deducted: £" + totalDeductions);
        System.out.println(this.name + " gets £" + this.netpay + "\n");
    }
}
