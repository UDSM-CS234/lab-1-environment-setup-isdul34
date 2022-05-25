public class Lab_1 {
    public static void main(String[] args) {
        double a = -9.81;
        double t = 10;
        double v= 0.0;
        double x= 0.0;
        x = ((0.5 * (a*t*t)) + (v* t)+ x);
        System.out.println(String.format("%.1f", x));
    }
}