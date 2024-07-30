public class Forecasting {
    public double forecast(double initialValue, double growthRate, int years) {
        if (years < 0) {
            throw new IllegalArgumentException("Years cannot be negative.");
        }
        if (initialValue < 0) {
            throw new IllegalArgumentException("Initial value cannot be negative.");
        }
        if (growthRate < -1) {
            throw new IllegalArgumentException("Growth rate cannot be less than -100%.");
        }
        
        if (years == 0) {
            return initialValue;
        }
        return forecast(initialValue * (1 + growthRate), growthRate, years - 1);
    }
}
