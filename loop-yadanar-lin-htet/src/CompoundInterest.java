void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the initial investment amount ($) : ");
    double principal = input.nextDouble();

    System.out.print("Enter the annual interest rate (e.g., 5 for 5%) : ");
    double interestRate = input.nextDouble();

    System.out.print("Enter the number of years : ");
    int years = input.nextInt();

    double balance = principal;

    System.out.printf("""
            
            Year Ending Balance
            -------------------
            """);

    for(int currentYear = 1; currentYear <= years; currentYear++){
        balance += (balance * (interestRate/100));
        System.out.println("Year %d - $%.2f".formatted(currentYear,balance));

    }
}