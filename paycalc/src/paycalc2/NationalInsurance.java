package paycalc2;

public class NationalInsurance extends Deductions{
    int rate;
    int niAmount;

    public NationalInsurance(int grosspay){
        this.rate = 12;
        niAmount = calculateDeduction(grosspay, this.rate);
    }

    @Override
    public void printDeduction() {
        System.out.print("At NI rate of " + rate + "%");
        System.out.println(" total NI deducted: " + niAmount);
    }

}
