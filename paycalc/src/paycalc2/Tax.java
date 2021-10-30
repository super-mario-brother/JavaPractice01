package paycalc2;

public class Tax extends Deductions{
    int rate = 0;
    int taxAmount;

    public Tax(int grosspay){
        if (grosspay >20000){
            this.rate = 20;
        }
        taxAmount = calculateDeduction(grosspay, this.rate);
    }

    @Override
    public void printDeduction() {
        System.out.print("At tax rate of " + rate + "%");
        System.out.println(" total tax deducted: " + taxAmount);
    }
}
