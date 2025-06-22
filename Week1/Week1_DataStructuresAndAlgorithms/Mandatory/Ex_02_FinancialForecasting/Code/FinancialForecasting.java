package Week1_DataStructuresAndAlgorithms.Mandatory.Ex_02_FinancialForecasting.Code;

public class FinancialForecasting {

  
    public static double forecastRecursive(double amount, double rate, int years) {
        if (years == 0) return amount;
        return forecastRecursive(amount, rate, years - 1) * (1 + rate);
    }


    public static double forecastIterative(double amount, double rate, int years) {
        for (int i = 0; i < years; i++) {
            amount *= (1 + rate);
        }
        return amount;
    }
}

