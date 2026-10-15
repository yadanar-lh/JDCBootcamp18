void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Working Years : ");
    double workingYears = input.nextDouble();

    System.out.print("Amount can save : ");
    double amountCanSaved = input.nextDouble();

    int counter = 0;
    double balance = 0;
    while(counter < workingYears){
        balance += amountCanSaved;
        counter++;
    }

    System.out.println("After retired, your balance is : " + balance);
    int annualSpend = 50000;
    int retiredYears = 20;
    double interestRate = 0.05;
    counter = 1;
    while(counter <= retiredYears && balance >= annualSpend){
        balance += (balance * interestRate);
        System.out.println(balance);
        balance -= annualSpend;
        System.out.println("Years %s , you left %s amount.".formatted(counter, balance));
        counter++;
    }

    if(balance >= amountCanSaved){
        System.out.println("Your spend %s years balance is %s.".formatted(retiredYears,balance));
    }
}