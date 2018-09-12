package day42.ExceptionHandling;
public class PgmWithoutException {

    public static void main( String[] args ) {
        int no1 = 100;
        int no2 = 10;

        try {
            int value = no1 / no2;
            System.out.println("I am Abu");
            System.out.println( value );
        } catch (Exception e ) {
           System.out.println("I will see this exception later-on....");
        }

        double deposit = no1 + 1000.0;
        System.out.println( "Deposit Amont: " + deposit );
    }
}