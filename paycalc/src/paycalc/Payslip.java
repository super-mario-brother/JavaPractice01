package paycalc;

public class Payslip {

    public static void main(String[] args){

        Taxpayer peyee = new Taxpayer();
        Tax tax = new Tax();
        Pension pension = new Pension();
        NationalInsurance ni = new NationalInsurance();
        Netpay net = new Netpay();

        peyee.setGrosspay(40000);
        System.out.println("Grosspay is:        "+ peyee.grosspay);

        int mytax = tax.calculate(peyee.grosspay);
        System.out.println("Tax:                "+ mytax);
        int myni = ni.calculate(peyee.grosspay);
        System.out.println("NI:                 "+ myni);
        int mypension = pension.calculate(peyee.grosspay);
        System.out.println("Pension:            "+ mypension);

        int deductions = net.calculateDeductions(mytax,myni,mypension);
        System.out.println("Deducted total:     "+ deductions );

        int pay = net.calculateNetpay(peyee.grosspay, deductions);
        System.out.println("You get:            "+ pay);
    }

}