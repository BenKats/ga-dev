/** This is created to be independant practice for working with dataTypes variables. Data sources are found at the below the class **/
import java.math.BigDecimal;
import java.math.RoundingMode;
public class HelloWorld {
    public static void main(String[] args) {
      // TODO: Complete the following variable declarations.
         BigDecimal oldYear = new BigDecimal("1950");
         BigDecimal nowYear = new BigDecimal("2016");
         BigDecimal averageFamilyIncome1950 = new BigDecimal(3_300);
         BigDecimal medianHomePrice1950 = new BigDecimal(7_354);
         BigDecimal tuitionYale1950 = new BigDecimal(600);
         BigDecimal roomAndBoardYale1950 = new BigDecimal(456);
         BigDecimal otherExpensesYale1950 = new BigDecimal(376);
         BigDecimal averageFamilyIncome2015 = new BigDecimal(51_017);
         BigDecimal medianHomePrice2015 = new BigDecimal(188_900);
         BigDecimal medianHomePriceManhattan2013 = new BigDecimal(855_000);
         BigDecimal tuitionYale2015 = new BigDecimal(45_800);
         BigDecimal roomAndBoardYale2015 = new BigDecimal(14_000);
         BigDecimal otherExpensesYale2015 = new BigDecimal(5_552);
        String intro = "To understand how purchasing power has changed in the past 65 years, it is useful to compare the family income to the cost of goods and services, such as housing and education.";
      // TODO: Find and fix a mistake in the following.
        if (intro == "A long time ago in a galaxy far, far away") {
            System.out.println("May the force be with you.");
        }
        else {
            System.out.println(intro);
        }
      // TODO: Use a print statment to add a newline or <br>.
      // TODO: Complete the following basic mathematical calculations.
        // Divide median home price by annual income and print each result to the command line.
        // Make 3 variables: homeRatio1950, homeRatio2015, homeRatioNYC2015
        // Find the total cost of university education for 1950 and for 2015 and print result to the command line.
        // Then divide university cost by annual income for both: educationRatio1950, & educationRation2015. Print the results to the command line.
      // TODO: Convert the following String into a number.
        BigDecimal homeRatio1950 = medianHomePrice1950.divide(averageFamilyIncome1950, 2, RoundingMode.HALF_UP);
        BigDecimal homeRatio2015 = medianHomePrice2015.divide(averageFamilyIncome2015, 2, RoundingMode.HALF_UP);
        BigDecimal homeRatioNYC2015;
       System.out.println("\nHome Ratio 1950 " + homeRatio1950 + "\nHome Ratio 2015 " + homeRatio2015 );
        BigDecimal totalYaleCost1950 = tuitionYale1950.add(roomAndBoardYale1950.add(otherExpensesYale1950));
        BigDecimal totalYaleCost2015 = tuitionYale2015.add(roomAndBoardYale2015.add(otherExpensesYale2015));
        System.out.println( "\nEdu Ratio 1950 " + totalYaleCost1950 + "\nEdu Ratio 2015 " + totalYaleCost2015 );
        System.out.println("\nedu/annual 1950 " + totalYaleCost1950.divide(averageFamilyIncome1950, 2, RoundingMode.HALF_UP) + "\nedu/annual 2015 " + totalYaleCost2015.divide(averageFamilyIncome2015, 2, RoundingMode.HALF_UP));

        String averageDebt1950 = "2000";
        int num1 = Integer.valueOf(averageDebt1950);

      // TODO: Complete the following variable declarations, find the typo, and replace the /*something*/'s in the String with the proper variables.
        int creditCardDebt2010 = 15_355;
        int totalDebt2010 = 129_579;
        String debt = "Debt is an unwelcome guest at the table in many American households. Back in the late 1940s and early 1950s, the average American consumer had less than $" + averageDebt1950 + "in total personal debt. Today the average U.S. household with debt carries $" + creditCardDebt2010 + "in credit card debt and $" + totalDebt2010 + "in total debt.";
     
      // TODO: Using one line of code, determine if the following string contains the word "table". Print the result to the command line.
       System.out.println(debt.contains("table"));
      // TODO: How has the ratio of debt to income changed in the past 60 years?
      BigDecimal ratio1950 = averageFamilyIncome1950.divide(BigDecimal.valueOf(Integer.valueOf(averageDebt1950)), 2, RoundingMode.HALF_UP);
      BigDecimal ratio2015 = averageFamilyIncome2015.divide(BigDecimal.valueOf(totalDebt2010),2, RoundingMode.HALF_UP);
      System.out.println("Ratio 1950: " + ratio1950 + " Ratio 2015 " + ratio2015 );
      // EXTRA: Round the answer to two decimal places.
      BigDecimal rounded = ratio1950.add(ratio2015);
      System.out.println(rounded);
    }
}
/** SOURCES:
 *  http://www.mybudget360.com/cost-of-living-2014-inflation-1950-vs-2014-data-housing-cars-college/
 *  http://oir.yale.edu/1701-1976-yale-book-numbers
 *  http://www.yale.edu/tuba/finaid/finaid-information/1516/1516EA_FYYE.pdf
 *  http://www.forbes.com/sites/erincarlyle/2014/01/30/manhattan-real-estate-ten-year-review-neighborhoods-where-prices-have-gone-up-the-most/
 *  https://www.mainstreet.com/article/americans-personal-debt-skyrockets
 *  http://www.nerdwallet.com/blog/credit-card-data/average-credit-card-debt-household/
 *  **/