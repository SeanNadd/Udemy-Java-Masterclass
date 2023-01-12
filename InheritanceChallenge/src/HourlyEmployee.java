public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(long employeeId, String hireDate, String name, String birthDate, String endDate, double hourlyPayRate) {
        super(employeeId, hireDate, name, birthDate, endDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        this.hourlyPayRate *= 2;
    }

    @Override
    public double collectPay(){
        return hourlyPayRate * 8;
    }
}
