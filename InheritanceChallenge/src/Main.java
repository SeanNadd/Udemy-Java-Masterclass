public class Main {
    public static void main(String[] args) {
        SalariedEmployee se = new SalariedEmployee(1, "2018-01-01", "John", "1988-05-08", "2023-05-08", 120000.0, false);
        HourlyEmployee he = new HourlyEmployee(1, "2018-01-01", "John", "1988-05-08", "2023-05-08", 25.50);

        System.out.println("Salaried Employee");
        System.out.println(se.getAge());
        System.out.println(se.collectPay());
        se.retire();
        System.out.println(se.isRetired());
        System.out.println();

        System.out.println("Hourly Employee");
        System.out.println(he.getAge());
        System.out.println(he.collectPay());
        he.getDoublePay();
        System.out.println(he.collectPay());
        System.out.println();

    }
}
