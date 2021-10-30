package paycalc2;

public class Pension extends Deductions{
    int rate;
    int pensionAmount;

    public Pension(int grosspay){
        this.rate = 3;
        pensionAmount = calculateDeduction(grosspay, this.rate);
    }

    @Override
    public void printDeduction() {
        System.out.print("At pension rate of " + rate + "%");
        System.out.println(" total pension deducted: " + pensionAmount);
    }

}
