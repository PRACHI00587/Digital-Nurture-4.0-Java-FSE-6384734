package Week1_DataStructuresAndAlgorithms.Ex_02_FinancialForecasting.Code;

// Main.java
public class Main {
    public static void main(String[] args) {
        double initialValue = 10000;     // Starting value
        double growthRate = 0.10;        // 10% annual growth
        int years = 5;

        System.out.println("📈 Recursive Forecasting:");
        double future = FinancialForecaster.forecastValueRecursive(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years = ₹" + future);

        System.out.println("\n⚡ Optimized with Memoization:");
        double[] memo = new double[years + 1];
        double futureMemo = FinancialForecaster.forecastValueMemo(initialValue, growthRate, years, memo);
        System.out.println("Future Value after " + years + " years = ₹" + futureMemo);
    }
}

