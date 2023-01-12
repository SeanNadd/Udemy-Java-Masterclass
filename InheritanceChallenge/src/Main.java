public class Main {
    public static void main(String[] args) {
        SalariedEmployee se = new SalariedEmployee( "2018-01-01", "John", "1988-05-08", "2023-05-08", 120000.0);
        HourlyEmployee he = new HourlyEmployee( "2018-01-01", "John", "1988-05-08", "2023-05-08", 25.50);

        System.out.println(se);
        System.out.println(se.getAge());
        System.out.println(se.collectPay());
        se.retire();
        System.out.println(se.isRetired());
        System.out.println(se.collectPay());
        System.out.println(se);
        System.out.println();

        System.out.println(he);
        System.out.println(he.getAge());
        System.out.println(he.collectPay());
        System.out.println(he.getDoublePay());
        System.out.println();

    }
}
