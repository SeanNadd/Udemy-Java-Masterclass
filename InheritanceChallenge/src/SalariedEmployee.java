import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(long employeeId, String hireDate, String name, String birthDate, String endDate, double annualSalary, boolean isRetired) {
        super(employeeId, hireDate, name, birthDate, endDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        setEndDate(LocalDate.now().minusDays(1).format(formatter));
    }

    public boolean isRetired() {
        return LocalDate.now().isAfter(stringToLocalDate(endDate));
    }

    @Override
    public double collectPay(){
        return annualSalary / 12;
    }
}