package Week1_DataStructuresAndAlgorithms.Ex_02_FinancialForecasting.Code;

// FinancialForecaster.java
public class FinancialForecaster {

    // Recursive method to calculate future value
    public static double forecastValueRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecastValueRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized version using memoization
    public static double forecastValueMemo(double initialValue, double growthRate, int years, double[] memo) {
        if (years == 0) return initialValue;
        if (memo[years] != 0) return memo[years];

        memo[years] = forecastValueMemo(initialValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}

