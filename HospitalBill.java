
public class HospitalBill {

    // Calculate room charges with 12% tax
    public static double calculateRoomCharges(double a) {
        double tax = a * 12 / 100;
        return a + tax;
    }

    // Calculate medical charges with 5% tax
    public static double calculateMedicalCharges(double b) {
        double tax = b * 5 / 100;
        return b + tax;
    }

    // Calculate laboratory charges with 8% tax
    public static double calculateLabCharges(double c) {
        double tax = c * 8 / 100;
        return c + tax;
    }

    // Calculate doctor consultation charges
    public static double calculateDoctorCharges(double d) {
        return d;
    }

    // Calculate emergency service charges
    public static double calculateEmergencyCharges(double e) {
        return e;
    }

    // Calculate total hospital bill
    public static double totalBill(
            double a, double b, double c, double d, double e) {

        double room = calculateRoomCharges(a);
        double medical = calculateMedicalCharges(b);
        double lab = calculateLabCharges(c);
        double doctor = calculateDoctorCharges(d);
        double emergency = calculateEmergencyCharges(e);

        return room + medical + lab + doctor + emergency;
    }

    // Calculate final bill after 10% discount
    public static double calculateFinalBill(
            double a, double b, double c, double d, double e) {

        double total = totalBill(a, b, c, d, e);
        double discount = total * 10 / 100;
        double payable = total - discount;

        System.out.printf("Total Hospital Bill = %.2f%n", total);
        System.out.printf("Discount = %.2f%n", discount);
        System.out.printf("Final Payable Amount = %.2f%n", payable);

        return payable;
    }

    public static void main(String[] args) {
        calculateFinalBill(2000, 1500, 1000, 800, 500);
    }
}
