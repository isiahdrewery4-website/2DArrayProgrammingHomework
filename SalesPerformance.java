public class SalesPerformance {
    public static void main(String[] args) {

        double[][] sales = {
            {1200.50, 1500.00, 1100.25, 1700.00},
            {1800.00, 1600.50, 1750.00, 1900.00},
            {900.00, 1250.00, 1400.00, 1300.00}
        };

        double companyTotal = 0.0;
        double highestTotal = 0.0;
        int topRepresentative = 0;

        for (int row = 0; row < sales.length; row++) {

            double representativeTotal = 0.0;

            for (int col = 0; col < sales[row].length; col++) {

                representativeTotal = representativeTotal
                        + sales[row][col];
            }

            System.out.printf("Representative %d total: $%.2f%n",
                    row + 1, representativeTotal);

            companyTotal = companyTotal + representativeTotal;

            if (representativeTotal > highestTotal) {

                highestTotal = representativeTotal;
                topRepresentative = row + 1;
            }
        }

        System.out.printf("\nCompany total sales: $%.2f%n", companyTotal);

        System.out.printf("Highest sales: Representative %d ($%.2f)%n",
                topRepresentative, highestTotal);
    }
}
