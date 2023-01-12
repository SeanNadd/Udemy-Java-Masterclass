import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String hireDate, String name, String birthDate, String endDate, double annualSalary) {
        super(hireDate, name, birthDate, endDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        terminate(LocalDate.now().minusDays(1).format(formatter));
        isRetired = true;
    }

    public boolean isRetired() {
        isRetired = LocalDate.now().isAfter(stringToLocalDate(endDate));
        return isRetired;
    }

    @Override
    public double collectPay(){
        return (isRetired()) ? (annualSalary * 0.9) / 12 : annualSalary / 12;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
