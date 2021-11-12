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

        BasePlusCommissionEmployee2 employee2 = new BasePlusCommissionEmployee2(
                "Mary",
                "Smith",
                "B111111Y",
                1000,
                0.7,
                1000);

        System.out.println("\nInformation from get methods: \n");
        System.out.printf("%s %s\n", "First name is", employee2.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee2.getLastName());
        System.out.printf("%s %s\n", "NI Number is", employee2.getNiNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", employee2.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is", employee2.getCommissionRate());
        System.out.printf("%s %.2f\n", "Base salary is", employee2.getBaseSalary());

        BasePlusCommissionEmployee3 employee3 = new BasePlusCommissionEmployee3(
                "Agent",
                "Smith",
                "C98765432X",
                10000,
                0.7,
                777);

        System.out.println("\nInformation from get methods: \n");
        System.out.printf("%s %s\n", "First name is", employee3.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee3.getLastName());
        System.out.printf("%s %s\n", "NI Number is", employee3.getNiNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", employee3.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is", employee3.getCommissionRate());
        System.out.printf("%s %.2f\n", "Base salary is", employee3.getBaseSalary());



        employee.setGrossSales(2200);
        employee.setCommissionRate(0.5);
        employee2.setCommissionRate(0.3);
        employee2.setBaseSalary(1200);
        employee3.setCommissionRate(0.9);
        employee3.setBaseSalary(999);
        employee3.setGrossSales(100000);
        employee3.setLastName("Scully");

        System.out.printf("\n%s:\n\n%s\n", "Updated information printed by toString", employee);
        System.out.printf("\n%s:\n\n%s\n", "Updated information printed by toString", employee2);
        System.out.printf("\n%s:\n\n%s\n", "Updated information printed by toString", employee3);

    }
}
