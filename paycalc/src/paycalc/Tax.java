package paycalc;

public class Tax{

    private int taxRate = 20; //percent

    public int calculate(int grosspay){
        Calculator calc = new Calculator();
        int tax_amount = calc.calculatePercentOf(grosspay,this.taxRate);
        return tax_amount;
    }

}
