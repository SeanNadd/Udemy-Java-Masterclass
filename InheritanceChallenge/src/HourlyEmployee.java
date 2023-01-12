public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String hireDate, String name, String birthDate, String endDate, double hourlyPayRate) {
        super(hireDate, name, birthDate, endDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }

    @Override
    public double collectPay(){
        return hourlyPayRate * 8;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
