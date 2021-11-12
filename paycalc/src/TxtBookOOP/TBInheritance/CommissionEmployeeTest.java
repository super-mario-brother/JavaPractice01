package TxtBookOOP.TBInheritance;

public class CommissionEmployeeTest {
    public static void main(String args[]){
        // instantiate commission employee object
        CommissionEmployee employee = new CommissionEmployee(
                "John",
                "Smith",
                "A12345678Z",
                2000,
                0.7);
        System.out.println("Information from get methods: \n");
        System.out.printf("%s %s\n", "First name is", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee.getLastName());
        System.out.printf("%s %s\n", "NI Number is", employee.getNiNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());

        employee.setGrossSales(2200);
        employee.setCommissionRate(0.5);

        System.out.printf("\n%s:\n\n%s\n", "Updated information printed by toString", employee);
    }
}
