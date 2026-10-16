void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter annual income ($) : ");
    double income = input.nextDouble();

    System.out.print("Enter years on current job : ");
    int yearsOnJob = input.nextInt();

    System.out.print("Enter credit score : ");
    int creditScore = input.nextInt();

    if(income >= 30000 && yearsOnJob >= 2){
        if(creditScore >= 750){
            double interestRate = 4.5;
            System.out.println("Loan Approved! Prime Interest Rate : " + interestRate + "%");
        } else if (creditScore >= 650){
            double interestRate = 6.0;
            System.out.println("Loan Approved! Standard Interest Rate : " + interestRate + "%");
        } else {
            System.out.println("Loan Rejected : Credit Score is too low.");
        }
    } else {
        System.out.println("Loan Rejected : Income or job duration requirement not met.");
    }
}