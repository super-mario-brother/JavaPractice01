package paycalc;

public class Netpay {

    int deductions;

    public int calculateDeductions(int tax, int ni, int pension){
        deductions = tax + ni + pension;
        return deductions;
    }

    public int calculateNetpay(int grosspay, int deductions){
        int pay = grosspay - deductions;
        return pay;
    }
}
