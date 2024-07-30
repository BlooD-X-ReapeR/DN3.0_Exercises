public class Main {
    public static void main(String[] args) {
        Forecasting forecasting = new Forecasting();

        double initialValue = 1000.0;
        double growthRate = 0.05;
        int years = 5;
        double futureValue = forecasting.forecast(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
