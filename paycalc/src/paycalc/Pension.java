package paycalc;

public class Pension {

    int rate = 3; //percent

    public int calculate(int grosspay){
        Calculator calc = new Calculator();
        int amount = calc.calculatePercentOf(grosspay, this.rate);
        return amount;
    }

}
