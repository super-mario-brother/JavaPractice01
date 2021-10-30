package paycalc2;

public class Payslip {
    public static void main(String[] args) {

        Payee mariusz = new Payee(10000, "Mariusz");
        mariusz.showInfo();

        mariusz.setGrosspay(25000);
        mariusz.calculateDeductions();
        mariusz.calculateTotals();
        mariusz.showInfo();

        Payee john = new Payee(19999, "John");
        john.showInfo();

        john.setGrosspay(100000);
        john.setName("Ben");
        john.calculateDeductions();
        john.calculateTotals();
        john.showInfo();
    }
}
