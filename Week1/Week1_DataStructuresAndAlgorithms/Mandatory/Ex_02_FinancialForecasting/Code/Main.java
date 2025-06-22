package Week1_DataStructuresAndAlgorithms.Mandatory.Ex_02_FinancialForecasting.Code;


public class Main {
    public static void main(String[] args) {
        double initial = 10000;
        double rate = 0.08;  // 8% annual growth
        int years = 5;

        double recursiveResult = FinancialForecasting.forecastRecursive(initial, rate, years);
        double iterativeResult = FinancialForecasting.forecastIterative(initial, rate, years);

        System.out.printf("🔁 Recursive Forecast after %d years: Rs %.2f%n", years, recursiveResult);
        System.out.printf("🔂 Iterative Forecast after %d years: Rs %.2f%n", years, iterativeResult);
    }
}
