package paycalc2;

public abstract class Deductions {

    public abstract void printDeduction();

    public int calculateDeduction(int grosspay, int rate){
        int z= grosspay*rate/100;
        return z;
    }

}
