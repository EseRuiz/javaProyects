
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SalaryCalculator sal = new SalaryCalculator();
        double descuento = sal.salaryMultiplier(7);
        System.out.println("descuento = " + descuento);
        int bonus = sal.bonusMultiplier(19);
        System.out.println("bonus = " + bonus);
        double multibonus = sal.bonusForProductsSold(5);
        System.out.println("multibonus = " + multibonus);
        double salary = sal.finalSalary(2,90);
        System.out.println("salary = " + salary);
    }
}