package paycalc;

public class NationalInsurance {

    int niRate = 12; //percent

    public int calculate(int grosspay){
        Calculator calc = new Calculator();
        int ni_amount = calc.calculatePercentOf(grosspay,this.niRate);
        return ni_amount;
    }


}
