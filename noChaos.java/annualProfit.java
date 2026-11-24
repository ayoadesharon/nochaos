public class annualProfit {
    public static void main(String[] args) {

        double annualProfit = (30000 - 5000);

        double fixedSales = (6.0 / 100 * 5000) + (8.0 / 100 * 5000);

        annualProfit -= fixedSales;

        double sales = (10.0 / 100 * 10000);

        int salesCount = 2;

        while (annualProfit > 0) {
            annualProfit -= sales;
            salesCount++;
        }

        System.out.println("We need to make " + salesCount + " sales");
    }
}
