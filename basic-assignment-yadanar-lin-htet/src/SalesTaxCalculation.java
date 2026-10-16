void main() {
    Scanner input = new Scanner(System.in);

    final double STATE_TAX_RATE = 0.04;
    final double COUNTY_TAX_RATE = 0.02;

    System.out.print("Enter Purchase Amount : ");
    double purchaseAmount = input.nextDouble();

    double stateTax  = purchaseAmount * STATE_TAX_RATE;
    double countyTax = purchaseAmount * COUNTY_TAX_RATE;
    double totalTax = stateTax + countyTax;
    double totalSale = purchaseAmount + totalTax;

    System.out.println("Purchase Amount : $" + purchaseAmount);
    System.out.println("State Tax(4%) : $" + stateTax);
    System.out.println("County Tax(2%) : $" + countyTax);
    System.out.println("Total Tax : $" + totalTax);
    System.out.println("Total Sale : $" + totalSale);

}