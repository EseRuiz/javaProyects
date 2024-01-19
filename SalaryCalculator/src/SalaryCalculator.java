public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double multiplier = (daysSkipped<5) ? 1 : 0.85 ;
        return multiplier ;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold<20) ? 10 : 13 ;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold)*productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000.0* salaryMultiplier((daysSkipped)) + bonusForProductsSold(productsSold);
        return (salary <= 2000.0) ? salary : 2000.0;
    }
}
