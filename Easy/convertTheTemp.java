public class convertTheTemp {
    public static double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Fahrenheit = (celsius * 1.80) + 32.00;

        return new double[] { Kelvin, Fahrenheit };
    }
    public static void main(String[] args) {
        System.out.println(convertTemperature(30.0));
    }
}
