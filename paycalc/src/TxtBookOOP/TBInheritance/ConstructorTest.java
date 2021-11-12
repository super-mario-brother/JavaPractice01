package TxtBookOOP.TBInheritance;

public class ConstructorTest {

    public static void main(String[] args) {

        CommissionEmployee4 employee1 = new CommissionEmployee4(
                "John", "Smith", "A111111Z", 1000, 0.1);
        System.out.println();

        BasePlusCommissionEmployee4 employee2 = new BasePlusCommissionEmployee4(
                "Mary", "Smith", "B222222Y", 2000, 0.2, 2000);
        System.out.println();

        BasePlusCommissionEmployee4 employee3 = new BasePlusCommissionEmployee4(
                "Agent", "Smith", "C333333X", 3000, 0.3, 3000);
        System.out.println();

        employee3.setLastName("Scully");
        System.out.printf("\n%s:\n\n%s\n", "Updated", employee3);

    }

}
